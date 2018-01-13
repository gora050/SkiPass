package VerifyStrategies;

import SkiPassUtil.SkiPass;

public class BaseVerifier implements Verifier {
    public boolean verify(SkiPass skipass) {
        return !skipass.isBlocked();
    }
}
