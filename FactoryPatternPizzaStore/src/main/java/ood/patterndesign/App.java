package ood.patterndesign;

import java.util.logging.Logger;

public class App {
    final static Logger LOGGER = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        AbstractPizzaStore nyStore = new NYPizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza("cheese");
        LOGGER.info("Ethan order a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        LOGGER.info("Joel ordered a " + pizza.getName() + "\n");

    }
}
