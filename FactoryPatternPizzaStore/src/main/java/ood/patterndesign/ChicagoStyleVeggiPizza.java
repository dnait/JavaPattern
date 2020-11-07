package ood.patterndesign;

import java.util.logging.Logger;

public class ChicagoStyleVeggiPizza extends AbstractPizza {
    final static Logger LOGGER = Logger.getLogger(ChicagoStyleVeggiPizza.class.getName());
    public ChicagoStyleVeggiPizza() {
        name = "Chicago Style Veggi Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Thousand Island Sauce";
        toppings.add("Green Onioin");
    }
    void cut() {
        LOGGER.info("Cutting the pizza into small slices");
    }
}
