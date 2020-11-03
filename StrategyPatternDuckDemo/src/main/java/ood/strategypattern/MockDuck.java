package ood.strategypattern;
import java.util.logging.Logger;
public class MockDuck extends Duck {
    final static Logger LOGGER = Logger.getLogger(MockDuck.class.getName());
    public MockDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        LOGGER.info("I am a model duck");
    }
}
