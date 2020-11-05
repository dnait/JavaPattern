package ood.decoratorpattern;
import java.text.NumberFormat;

import java.util.logging.Logger;
public class App {
    final static Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        AbstractBeverage espro = new Espresso();
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        LOGGER.info(String.format("%s, Total: $%.2f",espro.getDesc(),espro.cost()));

        AbstractBeverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        double res = houseBlend.cost();
        LOGGER.info(String.format("%s, Total: $%.2f", houseBlend.getDesc(), houseBlend.cost()));

        AbstractBeverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast); //double Mocha
        darkRoast = new Whip(darkRoast);
        LOGGER.info(String.format("%s, Total: $%.2f", darkRoast.getDesc(), darkRoast.cost()));

//        With size feature
        AbstractBeverage hb1= new HouseBlend("tall");
        hb1 = new Soy(hb1);
        hb1 = new Mocha(hb1);
        hb1 = new Whip(hb1);
        LOGGER.info(String.format("%s, Total: $%.2f", hb1.getDesc(), hb1.cost()));

        //        With size feature
        AbstractBeverage hb2 = new HouseBlend("tall");
        hb2.setSize("venti");
        hb2 = new Soy(hb2);
        hb2 = new Mocha(hb2);
        hb2 = new Whip(hb2);
        LOGGER.info(String.format("%s, Total: $%.2f", hb2.getDesc(), hb2.cost()));

        //Dont use "%1$s, $%2$s", will print $2.8000000000000003
        //use %.2f or df2.setRoundingMode(RoundingMode.DOWN)

//output:
//        Nov 05, 2020 8:56:48 AM ood.decoratorpattern.App main
//        INFO: Espresso, Total: $1.99
//        Nov 05, 2020 8:56:48 AM ood.decoratorpattern.App main
//        INFO: House Blend, Soy 0.1, Mocha 0.15, Whip 0.2, Total: $1.34
//        Nov 05, 2020 8:56:48 AM ood.decoratorpattern.App main
//        INFO: DarkRoast, Mocha 0.15, Mocha 0.15, Whip 0.2, Total: $2.55
//        Nov 05, 2020 8:56:48 AM ood.decoratorpattern.App main
//        INFO: House Blend, Soy 0.1, Mocha 0.15, Whip 0.2, Total: $1.34
//        Nov 05, 2020 8:56:48 AM ood.decoratorpattern.App main
//        INFO: House Blend, Soy 0.2, Mocha 0.25, Whip 0.3, Total: $1.64
    }
}
