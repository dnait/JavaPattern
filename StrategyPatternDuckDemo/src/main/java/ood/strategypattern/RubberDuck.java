package ood.strategypattern;
import java.util.logging.Logger;
public class RubberDuck extends Duck {
    final static Logger LOGGER = Logger.getLogger(RubberDuck.class.getName());
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    @Override
    void display() {
        LOGGER.info("This is not a real duck, it is a RUBBER duck");
    }
}
