package VerifyStrategies;

import SkiPassUtil.SkiPass;

import java.util.Date;

public class DaysNumberVerifier extends BaseVerifier {
    @Override
    public boolean verify(SkiPass skipass) {
        if (super.verify(skipass) && (skipass.getData() >= 0)) {
            Date now = new Date();
            boolean res;
            if (skipass.getLastUse() != null) {
                if (skipass.getLastUse().getDate() != now.getDate()) {
                    res = skipass.decreaseData();
                    skipass.setLastUse(now);
                } else {
                    res = true;
                }
            } else {
                res = skipass.decreaseData();
                skipass.setLastUse(now);
            }
            return res;
        }
        return false;

    }
}
