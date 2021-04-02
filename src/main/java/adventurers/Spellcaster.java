package adventurers;

import Equipment.Familiar;
import Equipment.FamiliarType;
import Equipment.Spell;
import Equipment.SpellType;

import behaviours.IFighter;

public abstract class Spellcaster extends Person {

    Spell spell;
    Familiar familiar;

    public Spellcaster(String name, int hp, Spell spell, Familiar familiar) {
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

    public int getWeaponDamage(){
        return this.spell.getSpellDamage();
    }

    public void changeSpell(Spell spell){
        this.spell = spell;
    }
}
