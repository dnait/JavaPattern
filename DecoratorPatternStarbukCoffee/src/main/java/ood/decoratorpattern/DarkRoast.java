package ood.decoratorpattern;

public class DarkRoast extends AbstractBeverage{
    public DarkRoast () { //use constructor to fresh the desc
        this.desc = "DarkRoast";
        this.size = "tall";
    }

    public DarkRoast (String size) { //use constructor to fresh the desc
        this.desc = "DarkRoast";
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public double cost() {
        return 2.05;
    }
}
