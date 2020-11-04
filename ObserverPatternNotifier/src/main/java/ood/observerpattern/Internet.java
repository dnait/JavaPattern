package ood.observerpattern;

import java.util.logging.Logger;

public class Internet implements Observer{
    final static Logger LOGGER = Logger.getLogger(Internet.class.getName());
    public void update(float interest) {
        LOGGER.info("Internet interest updated: " + interest);
    }
}
