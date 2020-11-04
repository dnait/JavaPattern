package ood.observerpattern;

public class App {
    //maintain all loasn information
    public static void main(String[] args) {
        Newspaper offlineMedia = new Newspaper();
        Internet onlineMedia = new Internet();
        Loan personalLoad = new Loan("Personal Loan", "Chase", 0.75f);
        personalLoad.registerObserver(offlineMedia);
        personalLoad.registerObserver(onlineMedia);
        //update interest then send notify
        personalLoad.setInterest(3.1f);

    }
}
