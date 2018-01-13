package SkiPassUtil;

import java.util.Date;

public final class SkiPassTry {
    private final SkiPass skiPass;
    private final Date time;
    private final boolean accepted;


    public SkiPassTry(SkiPass skiPass, boolean accepted) {
        this.skiPass = skiPass;
        this.accepted = accepted;
        this.time = new Date();
    }

    public SkiPass getSkiPass() {
        return skiPass;
    }

    public Date getTime() {
        return time;
    }

    public boolean isAccepted() {
        return accepted;
    }
}
