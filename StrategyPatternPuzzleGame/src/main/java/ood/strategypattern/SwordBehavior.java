package ood.strategypattern;
import java.util.logging.Logger;
public class SwordBehavior implements WeaponBehavior {
    final static Logger LOGGER = Logger.getLogger(SwordBehavior.class.getName());
    public void useWeapon() {
        LOGGER.info("Swing the sword");
    }
}
