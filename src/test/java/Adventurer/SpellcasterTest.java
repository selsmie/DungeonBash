package Adventurer;

import Equipment.Familiar;
import Equipment.FamiliarType;
import Equipment.Spell;
import Equipment.SpellType;
import adventurers.Warlock;
import adventurers.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpellcasterTest {

    Warlock warlock;
    Wizard wizard;
    Spell spell;
    Spell spell1;
    Familiar familiar;
    Familiar familiar2;

    @Before
    public void before(){
        spell = new Spell(SpellType.FIREBALL);
        spell1 = new Spell(SpellType.ELDRITCHBLAST);
        familiar = new Familiar(FamiliarType.OGRE);
        familiar2 = new Familiar(FamiliarType.DRAGON);
        warlock = new Warlock("Terry", 40, spell, familiar);
        wizard = new Wizard("Larry", 35, spell1, familiar2);
    }

    @Test
    public void hasName(){
        assertEquals("Terry", warlock.getName());
        assertEquals("Larry", wizard.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(40, warlock.getHp());
        assertEquals(35, wizard.getHp());
    }

    @Test
    public void hasFamiliar(){
        assertEquals(FamiliarType.OGRE, warlock.getFamiliar());
        assertEquals(FamiliarType.DRAGON, wizard.getFamiliar());
    }

    @Test
    public void hasFamiliarHealth(){
        assertEquals(10, warlock.getFamiliarHealth());
        assertEquals(40, wizard.getFamiliarHealth());
    }

    @Test
    public void hasSpell(){
        assertEquals(SpellType.FIREBALL, warlock.getSpell());
        assertEquals(SpellType.ELDRITCHBLAST, wizard.getSpell());
    }

    @Test
    public void hasSpellDamage(){
        assertEquals(18, warlock.getSpellDamage());
        assertEquals(87, wizard.getSpellDamage());
    }

    @Test
    public void canChangeSpell(){
        warlock.changeSpell(spell1);
        assertEquals(SpellType.ELDRITCHBLAST, warlock.getSpell());
    }
}
