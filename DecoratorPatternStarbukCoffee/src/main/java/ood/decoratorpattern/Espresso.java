package ood.decoratorpattern;

public class Espresso extends AbstractBeverage {
    public Espresso(String size) {
        this.desc = "Espresso";
        this.size = size;
    }
    //default small
    public Espresso() {
        this.desc = "Espresso";
        this.size = "tall";
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return 1.99;
    }
}
