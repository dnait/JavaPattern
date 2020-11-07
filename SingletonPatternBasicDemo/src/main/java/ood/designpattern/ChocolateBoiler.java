package ood.designpattern;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler chocolateBoiler;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    //if multithread, add 'synchronized', force every thread to wait its turn before it can enter the method
    //no two threads may enter the method at the same time
    public static synchronized ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            return new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    public void fill() {
        if (!isEmpty()) {
            //fill the chocolate with 500 gallons of unboiled milk/chocolate mixture
            empty = false;
            boiled = false;
        }
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //drain 500 gallons of boiled milk/chocolate mixture;
            empty = true;
        }
    }
    public void boil() {
        if (!isEmpty() && isBoiled()) {
            //bring the mixture to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
