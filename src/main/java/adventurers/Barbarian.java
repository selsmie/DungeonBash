package adventurers;

import Equipment.Weapon;

public class Barbarian extends Fighter{

    private int rage;

    public Barbarian(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
        this.rage = 2;

    }
    public int getWeaponDamage(){
        int damage = super.getWeaponDamage() * this.rage;
        return damage;
    }
}
