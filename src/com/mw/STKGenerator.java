package com.mw;

import java.security.NoSuchAlgorithmException;

import static com.mw.SHA256.generateSHA256;

public class STKGenerator {

    public byte[] generateShortTermKey(byte[] bArr) {
        byte[] generateSerialByteArray = Utils.generateSerialByteArray(bArr);
        byte[] reverse = Utils.reverse(generateSerialByteArray, generateSerialByteArray.length);
        try {
            return generateSHA256(reverse);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return reverse;
        }
    }
}
