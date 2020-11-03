package ood.strategypattern;
import java.util.logging.Logger;
public class WoodenDecoyDuck extends Duck {
    final static Logger LOGGER = Logger.getLogger(WoodenDecoyDuck.class.getName());
    WoodenDecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        LOGGER.info("Not a real duck. It is a wooden decoy duck");
    }
}
