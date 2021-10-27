package com.mw;

public class ChallengeRequestGenerator {

    public byte[] generateChallengeRequestCommand(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] calculate = Utils.calculate(Utils.concat(bArr, Commands.REQUEST_CHALLENGE));
        byte[] concat = Utils.concat(Utils.concat(bArr, Commands.REQUEST_CHALLENGE), Utils.reverse(calculate, calculate.length));
        byte[] concat2 = Utils.concat(bArr, new byte[]{18});
        try {
            return Utils.concat(concat2, Utils.encrypt(bArr3, bArr2, concat));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
