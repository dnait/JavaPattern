package ood.strategypattern;

public class AbstractCharacter {
    WeaponBehavior weaponBehavior;
    public void fight(){
        weaponBehavior.useWeapon();
    }
    public void setWeapon(WeaponBehavior wb) {
        this.weaponBehavior = wb;
    }
}
