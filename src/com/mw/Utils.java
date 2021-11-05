package com.mw;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Utils {

    private static int counter = 2;

    public static String byteArrayToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }

    public static byte[] generateSerialByteArray(byte[] bArr) {
        return ByteBuffer.allocate(4).putInt((bArr[2] & 255) + ((bArr[3] & 255) << 8) + ((bArr[4] & 255) << 16)).array();
    }

    public static byte[] reverse(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            i2--;
            bArr2[i2] = bArr[i3];
        }
        return bArr2;
    }

    public static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] calculate(byte[] bArr) {
        int i = 65535;
        for (byte b : bArr) {
            for (int i2 = 0; i2 < 8; i2++) {
                boolean z = true;
                boolean z2 = ((b >> (7 - i2)) & 1) == 1;
                if (((i >> 15) & 1) != 1) {
                    z = false;
                }
                i <<= 1;
                if (z2 ^ z) {
                    i ^= 4129;
                }
            }
        }
        int i3 = i & 65535;
        //System.out.println("CRC-CITT " + Integer.toHexString(i3));
        return Arrays.copyOfRange(ByteBuffer.allocate(4).putInt(i3).array(), 2, 4);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        while (bArr3.length % 16 != 0) {
            bArr3 = Utils.concat(bArr3, new byte[]{0});
        }
        Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
        instance.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return instance.doFinal(bArr3);
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        while (bArr3.length % 16 != 0) {
            bArr3 = Utils.concat(bArr3, new byte[]{0});
        }
        Cipher instance = Cipher.getInstance("AES/CBC/NoPadding");
        instance.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(bArr2));
        return instance.doFinal(bArr3);
    }

    public static boolean lockStatus(byte[] bArr) {
        System.out.println("Lock Status:");
        boolean lockOpen = false;
        if (bArr[0] == 11) {
            System.out.println("Lock is open!");
            lockOpen = true;
        } else if (bArr[0] == 2) {
            System.out.println("Lock is closed");
        } else if (bArr[0] == 15) {
            System.out.println("Status if open or closed unknown");
        }
        System.out.println("Firmware Version: " + (bArr[2] & 255));
        System.out.println("Hardware Version: " + (bArr[3] & 255));
        System.out.println("ILockITPlus: true");
        if (bArr[5] == 1) {
            System.out.println("Alarm: On");
        } else if (bArr[1] == 0) {
            System.out.println("Alarm: Off");
        }
        List<String> colorCodeString = new ArrayList<String>();
        if (bArr[12] != 99) {
            String colorCode = Utils.formatByteCode(new byte[]{bArr[12], bArr[13], bArr[14]});
            getColors(colorCodeString, colorCode);
            System.out.println();
        }
        if (bArr[15] != 99) {
            String colorCode = Utils.formatByteCode(new byte[]{bArr[15], bArr[16], bArr[17]});
            getColors(colorCodeString, colorCode);
            System.out.println();
        }
        return lockOpen;
    }

    private static void getColors(List<String> colorCodeString, String colorCode) {
        for (char character:colorCode.toCharArray()){
            switch (character){
                case '0':
                    colorCodeString.add("green");
                    break;
                case '1':
                    colorCodeString.add("blue");
                    break;
                case '2':
                    colorCodeString.add("red");
                    break;
                case '3':
                    colorCodeString.add("white");
                    break;
            }

        }
        System.out.print("Personal Color Code: ");
        for (String color: colorCodeString) {
            System.out.print(color + ",");
        }
    }

    public static String formatByteCode(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte append : bArr) {
            sb.append(append);
        }
        if (bArr[0] == 0 || bArr[0] == 1 || bArr[0] == 2 || bArr[0] == 3) {
            sb.insert(0, "0");
        }
        if (bArr[1] == 0 || bArr[1] == 1 || bArr[1] == 2 || bArr[1] == 3) {
            sb.insert(2, "0");
        }
        if (bArr[2] == 0 || bArr[2] == 1 || bArr[2] == 2 || bArr[2] == 3) {
            sb.insert(4, "0");
        }
        return sb.toString();
    }

    public static byte[] createLockAction(byte b) {
        int i = Utils.counter;
        byte[] bArr = {(byte) (i & 255), (byte) (i >> 8), b};
        Utils.counter = i + 1;
        return bArr;
    }

    public static byte[] response(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] LTK, byte[] encryptionPart) {
        byte[] calculate = calculate(Utils.concat(Utils.concat(new byte[]{bArr[0]}, bArr2), bArr3));
        byte[] concat = Utils.concat(Utils.concat(Utils.concat(new byte[]{bArr[0]}, bArr2), bArr3), Utils.reverse(calculate, calculate.length));
        try {
            return Utils.concat(bArr, encrypt(LTK, encryptionPart, concat));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
