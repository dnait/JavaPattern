package ood.strategypattern;

public class King extends AbstractCharacter {
    public King() {
        weaponBehavior = new SwordBehavior();
    }
}
