package adventurers;

import Equipment.Weapon;

public class Knight extends Fighter {

    private int armour;

    public Knight(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
        this.armour = 10;
    }

    public int getDefenceHp() {
       return this.getHp() + this.armour;

    }

    public void takesDamage(double attack){
        double remainingAttackPWR = attack;
        if (remainingAttackPWR > this.armour){
            remainingAttackPWR -= this.armour;
            super.takesDamage(remainingAttackPWR);
        }
    }

}
