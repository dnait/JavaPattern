package ood.strategypattern;

public class App {
    public static void main(String[] args) {
        AbstractCharacter king = new King();
        king.fight();  //Swing the sword
        king.setWeapon(new AxeBehavior());
        king.fight(); //Star to chop with an Axe
    }
}
