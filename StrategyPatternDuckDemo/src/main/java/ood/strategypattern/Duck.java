package ood.strategypattern;

import java.util.logging.Logger;

public abstract class Duck {
    private final static Logger LOGGER = Logger.getLogger(Duck.class.getName());
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    abstract void display();
    public void performFly() {
        flyBehavior.fly();
    };
    public void performQuack() {
        quackBehavior.quack();
    };
    public void swim() {
        LOGGER.info("Stat to swim...");
        LOGGER.info("Swimming complete!");
    }
    //setting behavior dynamically
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
