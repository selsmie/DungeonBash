package adventurers;

import Equipment.FamiliarType;
import Equipment.SpellType;
import behaviours.IAttack;
import behaviours.IFamiliar;
import behaviours.ISpell;

public abstract class Spellcaster extends Person {

    ISpell spell;
    IFamiliar familiar;

    public Spellcaster(String name, int hp, ISpell spell, IFamiliar familiar) {
        super(name, hp);
        this.spell = spell;
        this.familiar = familiar;
    }

    public SpellType getSpell() {
        return spell.getSpell();
    }

    public FamiliarType getFamiliar() {
        return familiar.getFamiliar();
    }

    public int getFamiliarHealth(){
        return this.familiar.getHealth();
    }

    public int getSpellDamage(){
        return this.spell.getSpellDamage();
    }

    public void changeSpell(ISpell spell){
        this.spell = spell;
    }
}
