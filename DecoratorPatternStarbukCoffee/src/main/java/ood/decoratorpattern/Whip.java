package ood.decoratorpattern;

public class Whip extends AbstractCondimentDecorator {
    AbstractBeverage beverage;
    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }
    public String getDesc() {
        return beverage.getDesc() + ", Whip " + Constant.WHIP_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);
        //add (beverage.cost() if wanna see each sum on each condiment)
    }


    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return beverage.cost() + Constant.WHIP_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);
    }
}
