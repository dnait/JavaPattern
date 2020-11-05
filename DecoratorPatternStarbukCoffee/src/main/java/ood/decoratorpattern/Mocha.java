package ood.decoratorpattern;

public class Mocha extends AbstractCondimentDecorator{
    AbstractBeverage beverage;
    public Mocha (AbstractBeverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }
    public String getDesc() {
        return beverage.getDesc() + ", Mocha " + Constant.MOCHA_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return beverage.cost() + Constant.MOCHA_SIZE_PRICE.getOrDefault(size, Double.MAX_VALUE);//wrapped beverage cost + mocha cost(0.20)
    }

}
