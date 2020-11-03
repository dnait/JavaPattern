package ood.strategypattern;
import java.util.logging.Logger;
public class MuteQuack implements QuackBehavior {
    final static Logger LOGGER = Logger.getLogger(MuteQuack.class.getName());
    public void quack(){
        LOGGER.info("<< Silence >>");
    }
}
