package adventurers;

import Equipment.Weapon;
import Equipment.WeaponType;

public abstract class Fighter extends Person {
    private Weapon weapon;


    public Fighter(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public WeaponType getWeapon() {
        return weapon.getWeapon();
    }

    public int getWeaponDamage(){
        return weapon.getWeaponDamage();
    }

    public void changeWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
