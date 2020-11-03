package ood.strategypattern;
import java.util.logging.Logger;
public class KnifeBehavior implements WeaponBehavior{
    final static Logger LOGGER = Logger.getLogger(KnifeBehavior.class.getName());
    public void useWeapon() {
        LOGGER.info("Took out the knife");
    }
}
