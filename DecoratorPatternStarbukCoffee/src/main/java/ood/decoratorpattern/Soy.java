package ood.decoratorpattern;

import java.util.Map;

public class Soy extends AbstractCondimentDecorator{
    AbstractBeverage beverage;
    public Soy(AbstractBeverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }
    public String getDesc() {
        return beverage.getDesc() + ", Soy " + Constant.SOY_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);
        //return beverage.getDesc() + ", Soy";
    }


    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return beverage.cost() + Constant.SOY_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);
    }
}
