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
        if (remainingAttackPWR > this.mageArmour){
            remainingAttackPWR -= this.mageArmour;
            super.takesDamage(remainingAttackPWR);
        }
    }
}
