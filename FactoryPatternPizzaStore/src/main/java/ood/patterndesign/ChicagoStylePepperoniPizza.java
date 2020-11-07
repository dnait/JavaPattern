package ood.patterndesign;

import java.util.logging.Logger;

public class ChicagoStylePepperoniPizza extends AbstractPizza {
    final static Logger LOGGER = Logger.getLogger(ChicagoStylePepperoniPizza.class.getName());
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Thick Crust Dough";
        sauce = "Chicago Honey Sauce";
        toppings.add("Chicago Shredded Cheetah Cheese");
    }
    void cut() {
        LOGGER.info("Cutting the pizza into long slices");
    }
}
