package ood.patterndesign;

import java.util.logging.Logger;

public class ChicagoStyleClamPizza extends AbstractPizza {

    final static Logger LOGGER = Logger.getLogger(ChicagoStyleClamPizza.class.getName());
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Chicago Plum Tomato Sauce";
        toppings.add("Chicago Shredded Mozzarella Cheese");
    }
    void cut() {
        LOGGER.info("Cutting the pizza into triangle slices");
    }
}
