package ood.decoratorpattern;

public abstract class AbstractCondimentDecorator extends AbstractBeverage {
    public abstract String getDesc(); //abstract since it will change everytime
}
