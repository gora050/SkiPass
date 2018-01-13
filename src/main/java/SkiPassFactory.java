import SkiPassUtil.SkiPass;

import java.util.ArrayList;
import java.util.Date;

import static SkiPassUtil.SkiPassTypes.SkiPassTimeType.HOLIDAY;
import static SkiPassUtil.SkiPassTypes.SkiPassTimeType.WORKDAY;
import static SkiPassUtil.SkiPassTypes.SkiPassValidateType.DAYS;
import static SkiPassUtil.SkiPassTypes.SkiPassValidateType.RIDES;
import static SkiPassUtil.SkiPassTypes.SkiPassValidateType.TIMEPOINT;

public class SkiPassFactory {
    private ArrayList<SkiPass> skiPasses;

    private SkiPass getSkiPass(SkiPass skiPass) {
        skiPasses.add(skiPass);
        return skiPass;
    }

    private SkiPass getWeekendSkiPass(int days) {
        SkiPass skiPass = new SkiPass(HOLIDAY, DAYS, days);
        return this.getSkiPass(skiPass);
    }

    private SkiPass getWorkdaySkiPass(int days) {
        SkiPass skiPass = new SkiPass(WORKDAY, DAYS, days);
        return this.getSkiPass(skiPass);
    }

    private SkiPass getWorkrideSkiPass(int rides) {
        SkiPass skiPass = new SkiPass(WORKDAY, RIDES, rides);
        return this.getSkiPass(skiPass);
    }

    private SkiPass getWeekendRideSkiPass(int rides) {
        SkiPass skiPass = new SkiPass(HOLIDAY, RIDES, rides);
        return this.getSkiPass(skiPass);
    }

    public SkiPass getWeekend2DaySkiPass() {
        return this.getWeekendSkiPass(2);
    }

    public SkiPass getWorkday2DaySkiPass(int days) {
        return this.getWorkdaySkiPass(2);
    }

    public SkiPass getWeekend1DaySkiPass() {
        return this.getWeekendSkiPass(1);
    }

    public SkiPass getWorkday1DaySkiPass() {
        return this.getWorkdaySkiPass(1);
    }

    public SkiPass getWorkday5DaySkiPass() {
        return this.getWorkdaySkiPass(5);
    }

    public SkiPass getWorkday10RidesSkiPass() {
        return this.getWorkrideSkiPass(10);
    }

    public SkiPass getWeekend10RidesSkiPass() {
        return this.getWeekendRideSkiPass(10);
    }

    public SkiPass getWorkday20RidesSkiPass() {
        return this.getWorkrideSkiPass(20);
    }

    public SkiPass getWeekend20RidesSkiPass() {
        return this.getWeekendRideSkiPass(20);
    }

    public SkiPass getWorkday50RidesSkiPass() {
        return this.getWorkrideSkiPass(50);
    }

    public SkiPass getWeekend50RidesSkiPass() {
        return this.getWeekendRideSkiPass(50);
    }

    public SkiPass getWorkday100RidesSkiPass() {
        return this.getWorkrideSkiPass(100);
    }

    public SkiPass getWeekend100RidesSkiPass() {
        return this.getWeekendRideSkiPass(100);
    }

    public SkiPass getWeekendSeasonSkiPass(int year) {
        SkiPass skiPass = new SkiPass(HOLIDAY, TIMEPOINT, year+1);
        return this.getSkiPass(skiPass);
    }


    public SkiPassFactory() {
        this.skiPasses = new ArrayList<>();
    }

}
