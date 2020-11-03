package ood.strategypattern;

public class Knight extends AbstractCharacter {
    public Knight () {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
