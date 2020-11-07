package ood.patterndesign;
import java.util.logging.Logger;
public class ChicagoStyleCheesePizza extends AbstractPizza{
    final static Logger LOGGER = Logger.getLogger(ChicagoStyleCheesePizza.class.getName());
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut() {
        LOGGER.info("Cutting the pizza into square slices");
    }
}
