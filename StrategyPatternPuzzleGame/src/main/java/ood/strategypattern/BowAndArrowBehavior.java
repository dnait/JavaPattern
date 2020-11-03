package ood.strategypattern;

import java.util.logging.Logger;

public class BowAndArrowBehavior implements WeaponBehavior {
    final static Logger LOGGER = Logger.getLogger(SwordBehavior.class.getName());
    public void useWeapon() {
        LOGGER.info("Draw a bow and arrow");
    }
}
