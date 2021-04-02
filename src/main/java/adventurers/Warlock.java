package adventurers;


import Equipment.Familiar;
import Equipment.Spell;

public class Warlock extends Spellcaster{

    private int pactMagic;

    public Warlock(String name, int hp, Spell spell, Familiar familiar) {
        super(name, hp, spell, familiar);
        this.pactMagic = 2;
    }
    public int getWeaponDamage(){
        int damage = super.getWeaponDamage() * this.pactMagic;
        return damage;
    }
}
