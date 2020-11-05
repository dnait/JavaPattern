package ood.decoratorpattern;

public class HouseBlend extends AbstractBeverage {
    public HouseBlend () {
        this.desc = "House Blend";
        this.size = "tall";
    }

    public HouseBlend (String size) {
        this.desc = "House Blend";
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return .89;
    }

}
