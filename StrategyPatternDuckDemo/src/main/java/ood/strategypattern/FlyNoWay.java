package ood.strategypattern;

import java.util.logging.Logger;
public class FlyNoWay implements FlyBehavior{
    final static Logger LOGGER  = Logger.getLogger(FlyNoWay.class.getName());
    public void fly(){
        LOGGER.info("Cannot fly.");
        LOGGER.info("Skip fly.");
    }
}
