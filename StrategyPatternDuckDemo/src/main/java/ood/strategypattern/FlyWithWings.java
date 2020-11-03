package ood.strategypattern;
import java.util.logging.Logger;

public class FlyWithWings implements FlyBehavior{
    final static Logger LOGGER = Logger.getLogger(FlyWithWings.class.getName());
    public void fly(){
        LOGGER.info("Start to fly...");
        LOGGER.info("Fly complete!");
    }
}
