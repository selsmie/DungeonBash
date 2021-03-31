package adventurers;

import Equipment.Spell;
import behaviours.IFamiliar;
import behaviours.ISpell;

public class Wizard extends Spellcaster {

    private int mageArmour;

    public Wizard(String name, int hp, ISpell spell, IFamiliar familiar) {
        super(name, hp, spell, familiar);
        this.mageArmour = 10;
    }

    public void takesDamage(int attack){
        int remainingAttackPWR = attack;
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
