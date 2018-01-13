package VerifyStrategies;

import SkiPassUtil.SkiPass;

import java.util.Date;

public class TimepointVerifier  extends BaseVerifier {
    @Override
    public boolean verify(SkiPass skipass) {
        return super.verify(skipass) && (skipass.getData() <  new Date().getYear());
    }
}