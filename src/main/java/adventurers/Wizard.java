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
}
