package adventurers;

import behaviours.IFamiliar;
import behaviours.ISpell;

public class Warlock extends Spellcaster{

    private int pactMagic;

    public Warlock(String name, int hp, ISpell spell, IFamiliar familiar) {
        super(name, hp, spell, familiar);
        this.pactMagic = 2;
    }
}
