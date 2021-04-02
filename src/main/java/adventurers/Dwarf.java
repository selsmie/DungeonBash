package adventurers;

import Equipment.Weapon;

public class Dwarf extends Fighter{

    private double treasureHunter;

    public Dwarf(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
        this.treasureHunter = 2;
    }

    public void addTreasureToPurse(double treasure){
        treasure = treasure * this.treasureHunter;
        super.addTreasureToPurse(treasure);
    }
}
