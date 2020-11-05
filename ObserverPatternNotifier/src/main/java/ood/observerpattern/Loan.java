package ood.observerpattern;
import java.util.*;
import java.util.logging.Logger;

public class Loan implements Subject {

    final static Logger LOGGER = Logger.getLogger(Loan.class.getName());
    private String type;
    private float interest;
    private String bank;
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    //constructor
    public Loan (String type, String bank, float interest) {
        this.type = type;
        this.bank = bank;
        this.interest = interest;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
        notifyObserver();
    }
    public String getBank() {
        return bank;
    }
    public String getType() {
        return type;
    }

    public void registerObserver(Observer ob) {
        observerList.add(ob);
    }

    public void removeObserver(Observer ob) {
        observerList.remove(ob);
    }

    public void notifyObserver() {
        for (Observer ob : observerList) {
            LOGGER.info("Notify the client on the interest rate");
            ob.update(interest);
        }
    }
}
