package ood.patterndesign;

public abstract class AbstractPizzaStore {
    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza;
        pizza = createPizza(type);//abstract
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract AbstractPizza createPizza(String type);
}
