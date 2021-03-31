package Equipment;

import behaviours.ISpell;

public class Spell implements ISpell {

    SpellType spellType;

    public Spell(SpellType spellType){
        this.spellType = spellType;
    }

    public int getSpellDamage(){
        return this.spellType.getSpellDamage();
    }

    public SpellType getSpell(){
        return this.spellType;
    }

}
