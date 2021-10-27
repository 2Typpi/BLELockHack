package com.mw;

import java.security.NoSuchAlgorithmException;

import static com.mw.SHA256.generateSHA256;

public class AuthTokenGenerator {

    public byte[] generateAuthTokenCommand(byte[] bArr) {
        byte[] calculate = Utils.calculate(Utils.concat(Commands.AUTHENTICATOR, bArr));
        return Utils.concat(Utils.concat(Commands.AUTHENTICATOR, bArr), Utils.reverse(calculate, calculate.length));
    }

    public byte[] generateAuthToken(byte[] bArr, byte[] bArr2) {
        byte[] concat = Utils.concat(bArr, bArr2);
        try {
            return generateSHA256(concat);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return concat;
        }
    }
}
