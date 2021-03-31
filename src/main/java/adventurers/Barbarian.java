package adventurers;

import behaviours.IWeapon;

public class Barbarian extends Fighter{

    private int rage;

    public Barbarian(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);
        this.rage = 2;

    }
}
