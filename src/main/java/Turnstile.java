import SkiPassUtil.SkiPass;
import SkiPassUtil.SkiPassTry;
import VerifyStrategies.TimeVerifier;
import VerifyStrategies.Verifier;

public class Turnstile {
    PassSystem system;

    public Turnstile(PassSystem system) {
        this.system = system;
    }

    public boolean validate(SkiPass skiPass) {
        boolean res = false;
        if (!skiPass.isBlocked() && new TimeVerifier().verify(skiPass) && skiPass.getNumberVerifier().verify(skiPass)) {
            res = true;
        }
        system.pushTry(new SkiPassTry(skiPass,res));
        return res;
    }


}
