package adventurers;

import behaviours.IWeapon;

public class Dwarf extends Fighter{

    private double treasureHunter;

    public Dwarf(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);
        this.treasureHunter = 2;
    }
}
