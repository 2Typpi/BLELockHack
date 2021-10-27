package com.mw;

import java.util.Arrays;

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
        String STKGenerationMessage = "03008bd530002688000000000000000000000000";
        String authByteMessage = "0700f2b9d5158dec07bf05a43026982b4222433ce86cadf7a37211c8da5fa1e11df5000686c13c697fbd3cbe0ffb330776928a110f7bf226b9441a6749110e943e75e8c84b928a110f7bf226b9441a67";
        String invokeChallengeMessage = "0900ac202e0c6f9ea717131962ec621aff6a9d0a";
        String LTKConfirmationMessage = "0032b3e692dda29d6bcb488ed702eed08e8fb4fa591252c6c99fb49e6b6920b06feed0aa09788628e0d1bec2e43b1ee24f1e20b06feed0aa09788628";
        String lockStatus = "0022cf5f839e6994b0e9ffb5133c75da7b4d90948d7a3cae0e055d67be4f95a8f8eb75da7b4d9094";

        byte[] lockMessage = Utils.hexStringToByteArray(STKGenerationMessage);
        System.out.println("Message from Lock to generate STK: " + Utils.byteArrayToHex(lockMessage));
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
        Utils.lockStatus(cpRange);
        byte[] requestAlarmTimes = request(Utils.concat(authByte, new byte[]{18}), Commands.REQUEST_ALARM_TIMES, encryptionPart, LTK);
        System.out.println("Request Alarm Times: "+ byteArrayToHex(requestAlarmTimes));
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
