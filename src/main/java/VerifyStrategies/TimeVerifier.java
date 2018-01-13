package VerifyStrategies;

import SkiPassUtil.SkiPass;
import SkiPassUtil.SkiPassTypes.SkiPassTimeType;

import java.util.Calendar;
import java.util.Date;

public class TimeVerifier extends BaseVerifier {
    @Override
    public boolean verify(SkiPass skipass) {
        return super.verify(skipass) && ((skipass.getTimeType() == SkiPassTimeType.HOLIDAY && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) >= 6) || (skipass.getTimeType() == SkiPassTimeType.WORKDAY && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) < 6));
    }
}