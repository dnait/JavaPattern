package ood.strategypattern;

public class Queen extends AbstractCharacter {
    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }
}
