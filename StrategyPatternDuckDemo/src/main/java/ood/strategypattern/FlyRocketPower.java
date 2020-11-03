package ood.strategypattern;
import java.util.logging.Logger;
public class FlyRocketPower implements FlyBehavior{
    final static Logger LOGGER = Logger.getLogger((FlyRocketPower.class.getName()));
    public void fly() {
        LOGGER.info("I am flying with a rocket!");
    }
}
