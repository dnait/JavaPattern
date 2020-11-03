package ood.strategypattern;

public class Troll extends AbstractCharacter{
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
