package com.mw;

import java.security.NoSuchAlgorithmException;

public class LTKGenerator {

    public byte[] generateLongTermKey(byte[] bArr) {
        try {
            return SHA256.generateSHA256(Utils.concat(Utils.concat(bArr, Constants.FILLER), Constants.ASCII_CODE_ILI_LTK));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public byte[] generateLongTermKeyConfirmationCommand(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] calculate = Utils.calculate(Utils.concat(bArr, Commands.LONG_TERM_KEY_CONFIRMATION));
        byte[] concat = Utils.concat(Utils.concat(bArr, Commands.LONG_TERM_KEY_CONFIRMATION), Utils.reverse(calculate, calculate.length));
        try {
            return Utils.concat(Utils.concat(bArr, new byte[]{18}), Utils.encrypt(bArr3, bArr2, concat));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
