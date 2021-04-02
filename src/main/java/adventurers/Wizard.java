package adventurers;

import Equipment.Familiar;
import Equipment.Spell;

public class Wizard extends Spellcaster {

    private int mageArmour;

    public Wizard(String name, int hp, Spell spell, Familiar familiar) {
        super(name, hp, spell, familiar);
        this.mageArmour = 10;
    }

    public void takesDamage(double attack){
        double remainingAttackPWR = attack;
        int hp = this.getHp();
        if (remainingAttackPWR > this.mageArmour){
            remainingAttackPWR -= this.mageArmour;
            if (remainingAttackPWR >= hp){
                this.setHp(0);
            } else {
                hp -= remainingAttackPWR;
                this.setHp(hp);
            }
        }
    }
}
