package SkiPassUtil;

import SkiPassUtil.SkiPassTypes.SkiPassTimeType;
import SkiPassUtil.SkiPassTypes.SkiPassValidateType;
import VerifyStrategies.*;

import java.util.Date;

public class SkiPass {
    private static int idCounter = 0;
    private final int id;
    private boolean blocked = false;
    private SkiPassValidateType ridesType;
    private SkiPassTimeType timeType;
    private int data;
    private Date creationDate;
    private Date lastUse;
    private Verifier numberVerifier;


    public SkiPass(SkiPassTimeType timeType, SkiPassValidateType ridesType, int data) {
        this.id = idCounter++;
        this.timeType = timeType;
        this.ridesType = ridesType;
        this.data = data;
        this.creationDate = new Date();
        this.lastUse = null;
        switch (this.ridesType) {
            case RIDES:
                numberVerifier = new RideNumberVerifier();
                break;
            case DAYS:
                numberVerifier = new DaysNumberVerifier();
                break;
            case TIMEPOINT:
                numberVerifier = new TimepointVerifier();
                break;
            default:
                numberVerifier = new BaseVerifier();
                break;
        }
    }

    public Verifier getNumberVerifier() {
        return numberVerifier;
    }

    public void block() {
        this.blocked = true;
    }

    public void setLastUse(Date lastUse) {
        this.lastUse = lastUse;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public SkiPassValidateType getRidesType() {
        return ridesType;
    }

    public SkiPassTimeType getTimeType() {
        return timeType;
    }

    public int getData() {
        return data;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastUse() {
        return lastUse;
    }

    public boolean decreaseData() {
        this.data -= 1;
        return this.data >= 0;
    }
}
