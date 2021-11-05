package com.mw;

import java.util.Arrays;
import java.util.List;

import static com.mw.Utils.byteArrayToHex;
import static com.mw.Utils.hexStringToByteArray;

/*      crackleFormat.pcap
        String STKGenerationMessage = "03008bd530002688000000000000000000000000";
        String authByteMessage = "07007bbe246b8c8ac2078ba9abb702be3993d5ff875e0d590740b5a6c13204e0c1910073bd99934f4b6fb6f55fbc5ffb375660567bcf2d7b73b7124d6ab3c6a244b10716755660567bcf2d7b73b7124d";
        String invokeChallengeMessage = "09002119b9d73dbcc4671d85476f302fbd143ea2";
        String LTKConfirmationMessage = "0032d5707e22fe508ee0d0f563feb0a4655f6f1976cf7784a1e5ce76ffa96cda90b4f75c20eb0e778d0c8c253777d362aa626cda90b4f75c20eb0e77";
        String personalCodeMessage = "0012ba7e8ea5b240e53915d1d45cf2056d950e77";

        STK: f3abc4cd45501437a6fd465eed937aed50f0645f96d9b7aa82597f0a01273239
*/

public class Main {

    public static void main(String[] args) {
        String filePath = args[0];

        MessageParser messageParser = new MessageParser();
        List<String> messages = messageParser.getMessages(filePath);

        if (messages == null) {
            return;
        }

        String STKGenerationMessage = messages.get(0);
        String authByteMessage = messages.get(1);
        String invokeChallengeMessage = messages.get(2);
        String LTKConfirmationMessage = messages.get(3);
        String lockStatus = messages.get(4);

        byte[] lockMessage = Utils.hexStringToByteArray(STKGenerationMessage);
        STKGenerator stkGenerator = new STKGenerator();
        byte[] STK = stkGenerator.generateShortTermKey(lockMessage);
        System.out.println("STK: " + Utils.byteArrayToHex(STK));

        /*byte[] lockResponse = new byte[]{4, 0, 124, 21, 72, 15, 32, 118, -57, 107, 35, -60, 74, -46, 79, 38, -20, -38, -25, 104, -114, -2, 88, -2, 124, -72, -123, -37, -111, -52, -6, 110, 127, -57, 19, 14, -20, -38, -25, 104};
        AuthTokenGenerator authTokenGenerator = new AuthTokenGenerator();
        byte[] generateAuthToken = authTokenGenerator.generateAuthToken(STK, Arrays.copyOfRange(lockResponse, 2, 34));
        byte[] authTokenCommand = authTokenGenerator.generateAuthTokenCommand(generateAuthToken);
        System.out.println("Message from Phone to generate AuthToken: " + Utils.byteArrayToHex(authTokenCommand));*/

        //Missing Validation but if not valid = no Connection.
        byte[] messageHex = hexStringToByteArray(authByteMessage);
        byte[] authByte = new byte[]{messageHex[34]};
        System.out.println("AuthByte: " + Utils.byteArrayToHex(authByte));

        byte[] x = hexStringToByteArray(invokeChallengeMessage);
        byte[] encryptionPart = Arrays.copyOfRange(hexStringToByteArray(invokeChallengeMessage), 2, 18);
        ChallengeRequestGenerator challengeRequestGenerator = new ChallengeRequestGenerator();
        byte[] challengeRequest = challengeRequestGenerator.generateChallengeRequestCommand(authByte, encryptionPart, STK);
        System.out.println("Challenge for the Lock: " + Utils.byteArrayToHex(challengeRequest));

        byte[] LTKConfirmationMessageHex = hexStringToByteArray(LTKConfirmationMessage);
        byte[] decryptedMessage = decryptMessage(STK, encryptionPart, LTKConfirmationMessageHex);

        byte[] copyOfRange = Arrays.copyOfRange(decryptedMessage, 4, (decryptedMessage[1] & 255) - 2);
        LTKGenerator ltkGenerator = new LTKGenerator();
        byte[] LTK = ltkGenerator.generateLongTermKey(copyOfRange);
        byte[] encryptedLTKConf = ltkGenerator.generateLongTermKeyConfirmationCommand(authByte, encryptionPart, LTK);
        System.out.println("LTK: " + Utils.byteArrayToHex(LTK));
        System.out.println("Confirmation of LTK: " + Utils.byteArrayToHex(encryptedLTKConf));

        byte[] requestPersonalCode = request(Utils.concat(authByte, new byte[]{18}), Commands.REQUEST_PERSONAL_CODE, encryptionPart, LTK);
        System.out.println("Request Personal Code: " + Utils.byteArrayToHex(requestPersonalCode));

/*
        String personalCodeMessage = "0012ea39b1c557d8287f74eec04947688cd48628";
        byte[] personalCodeMessageHex = hexStringToByteArray(personalCodeMessage);
        byte[] personalCode = decryptMessage(LTK, encryptionPart, personalCodeMessageHex);
        System.out.println(personalCode[4] != 99);
        System.out.println(Utils.byteArrayToHex(personalCode));*/

        byte[] lockStatusHex = hexStringToByteArray(lockStatus);
        byte[] decryptLockStatus = decryptMessage(LTK, encryptionPart, lockStatusHex);
        byte[] cpRange = Arrays.copyOfRange(decryptLockStatus, 4, decryptLockStatus.length - 2);
        boolean lockOpen = Utils.lockStatus(cpRange);
        byte[] requestAlarmTimes = request(Utils.concat(authByte, new byte[]{18}), Commands.REQUEST_ALARM_TIMES, encryptionPart, LTK);
        System.out.println("Request Alarm Times: "+ byteArrayToHex(requestAlarmTimes));

        //if (lockOpen){
            byte[] openOrClose = Utils.response(Utils.concat(authByte, new byte[]{18}), Commands.RESPONSE_LOCK_ACTION, Utils.createLockAction((byte) 2), LTK, encryptionPart);
            System.out.println("Message to close lock: "+ byteArrayToHex(openOrClose));
        //} else {
            openOrClose = Utils.response(Utils.concat(authByte, new byte[]{18}), Commands.RESPONSE_LOCK_ACTION, Utils.createLockAction((byte) 1), LTK, encryptionPart);
            System.out.println("Message to open lock: "+ byteArrayToHex(openOrClose));
        //}
    }

    public static byte[] request(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] calculate = Utils.calculate(Utils.concat(new byte[]{bArr[0]}, bArr2));
        byte[] concat = Utils.concat(Utils.concat(new byte[]{bArr[0]}, bArr2), Utils.reverse(calculate, calculate.length));
        try {
            return Utils.concat(bArr, Utils.encrypt(bArr4, bArr3, concat));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] decryptMessage(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] decrypt = Utils.decrypt(bArr, bArr2, Arrays.copyOfRange(bArr3, 2, bArr3[1] & 255));
            return Arrays.copyOfRange(decrypt, 0, decrypt[1] & 255);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

