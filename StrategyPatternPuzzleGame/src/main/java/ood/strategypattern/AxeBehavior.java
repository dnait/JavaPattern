package ood.strategypattern;
import java.util.logging.Logger;
public class AxeBehavior implements WeaponBehavior {
    final static Logger LOGGER = Logger.getLogger(SwordBehavior.class.getName());
    public void useWeapon() {
        LOGGER.info("Star to chop with an Axe");
    }
}
