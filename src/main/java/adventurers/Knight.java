package adventurers;

import behaviours.IWeapon;

public class Knight extends Fighter {

    private int armour;

    public Knight(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);
        this.armour = 20;
    }
}
