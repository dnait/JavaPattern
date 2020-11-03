package ood.strategypattern;
import java.util.logging.Logger;
public class Squeak implements QuackBehavior{
    final static Logger LOGGER = Logger.getLogger(Squeak.class.getName());
    public void quack() {
        LOGGER.info("squeak...squeak...squeak...");
    }
}
