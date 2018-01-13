import SkiPassUtil.SkiPassTry;

import java.util.ArrayList;

public class PassSystem {
    private ArrayList<SkiPassTry> triesLog;
    private ArrayList<Turnstile> turnstiles;
    private SkiPassFactory skiPassFactory;


    public PassSystem() {
        triesLog = new ArrayList<SkiPassTry>();
        turnstiles = new ArrayList<Turnstile>();
        skiPassFactory = new SkiPassFactory();
    }

    public void pushTry(SkiPassTry skiPassTry) {
        triesLog.add(skiPassTry);
    }

    public void pushTurnstile(Turnstile turnstile) {
        turnstiles.add(turnstile);
    }

    public Turnstile getTurnstile(int id) {
        return turnstiles.get(id);
    }

    public ArrayList<SkiPassTry> getTriesLog() {
        return triesLog;
    }

    public SkiPassFactory getSkiPassFactory() {
        return skiPassFactory;
    }

}
