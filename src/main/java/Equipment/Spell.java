package Equipment;

public class Spell  {

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
