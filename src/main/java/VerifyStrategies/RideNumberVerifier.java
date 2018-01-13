package VerifyStrategies;

import SkiPassUtil.SkiPass;

public class RideNumberVerifier extends BaseVerifier {
    @Override
    public boolean verify(SkiPass skipass) {
        if (super.verify(skipass) && (skipass.getData() > 0)) {
            skipass.decreaseData();
            return true;
        }
        return false;
    }
}