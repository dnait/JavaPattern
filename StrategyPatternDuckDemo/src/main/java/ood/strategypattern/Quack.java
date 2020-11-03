package ood.strategypattern;
import java.util.logging.Logger;
public class Quack implements QuackBehavior{
    final static Logger LOGGER = Logger.getLogger(Quack.class.getName());
    public void quack(){
        LOGGER.info("Quack...quack...quack...");
    }
}
