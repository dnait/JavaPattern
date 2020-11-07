package ood.patterndesign;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class AbstractPizza {
    final static Logger LOGGER = Logger.getLogger(AbstractPizza.class.getName());
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<String>();

    void prepare() {
        LOGGER.info("Preparing " + name);
        LOGGER.info("Tossing dough... ");
        LOGGER.info("Adding sauce... ");
        LOGGER.info("Adding toppings:  ");
        for (String topping : toppings) {
            LOGGER.info(" " + topping);
        }
    }
    void bake() {
        LOGGER.info("Bake for 25 mins at 350");
    }
    void cut() {
        LOGGER.info("Cutting the pizza into diagonal slices");
    }
    void box() {
        LOGGER.info("Place pizza in offical PizzaStore box");
    }
    public String getName() {
        return name;
    }
}
