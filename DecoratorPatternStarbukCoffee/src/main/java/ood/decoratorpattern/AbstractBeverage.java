package ood.decoratorpattern;

public abstract class AbstractBeverage {
    String desc = "Unknown beverage";
    String size = "Unknown size"; //default is tall;
    public String getDesc() { //no abstract since it is fixed to call in abstractCondimentDecorator
        return desc;
    }
    public abstract void setSize(String size);
    public abstract String getSize();
    public abstract double cost();
}
