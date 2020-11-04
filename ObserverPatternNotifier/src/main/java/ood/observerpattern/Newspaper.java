package ood.observerpattern;

import java.util.logging.Logger;

public class Newspaper implements Observer{

    final static Logger LOGGER = Logger.getLogger(Newspaper.class.getName());
    public void update(float interest) {
        LOGGER.info("Newspaper: interest updated:" + interest);
    }
}
