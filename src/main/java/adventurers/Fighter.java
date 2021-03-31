package adventurers;

import Equipment.WeaponType;

import behaviours.IFighter;
import behaviours.IWeapon;

public abstract class Fighter extends Person implements IFighter {
    private IWeapon weapon;


    public Fighter(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon.getWeapon();
    }

    public int getWeaponDamage(){
        return weapon.getWeaponDamage();
    }

    public void changeWeapon(IWeapon weapon){
        this.weapon = weapon;
    }
}
