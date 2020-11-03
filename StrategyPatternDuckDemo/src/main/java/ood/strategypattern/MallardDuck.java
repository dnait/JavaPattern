package ood.strategypattern;
import java.util.logging.Logger;
public class MallardDuck extends Duck {
    final static Logger LOGGER = Logger.getLogger(MallardDuck.class.getName());
    //constructor
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        LOGGER.info("Pretty Mallard Duck");
    }
}
