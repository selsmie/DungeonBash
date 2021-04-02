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
        int hp = this.getHp();
        if (remainingAttackPWR > this.armour){
            remainingAttackPWR -= this.armour;
            if (remainingAttackPWR >= hp){
                this.setHp(0);
            } else {
                hp -= remainingAttackPWR;
                this.setHp(hp);
            }
        }
    }

}
