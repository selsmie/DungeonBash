package adventurers;

import behaviours.IFamiliar;
import behaviours.ISpell;

public class Warlock extends Spellcaster{
    public Warlock(String name, int hp, ISpell spell, IFamiliar familiar) {
        super(name, hp, spell, familiar);
    }
}
