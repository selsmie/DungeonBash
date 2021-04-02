import Equipment.*;
import adventurers.Dwarf;
import adventurers.Knight;
import adventurers.Warlock;
import behaviours.IFighter;
import org.junit.Before;
import org.junit.Test;
import quest.MultiPlayerQuest;

import java.util.ArrayList;

public class MultiPlayerTest {

    MultiPlayerQuest quest;
    Knight knight;
    Dwarf dwarf;
    Warlock warlock;
    Weapon sword;
    Weapon axe;
    Spell spell;
    Familiar cat;


    @Before
    public void before(){
        sword = new Weapon(WeaponType.SWORD);
        axe = new Weapon(WeaponType.AXE);
        spell = new Spell(SpellType.ELDRITCHBLAST);
        knight = new Knight("Tim", 50, sword);
        dwarf = new Dwarf("Pete", 75, axe);
        cat = new Familiar(FamiliarType.DRAGON);
        warlock = new Warlock("JimBob", 30, spell, cat);
        quest = new MultiPlayerQuest();
        quest.addPlayerToPlayers(knight);
        quest.addPlayerToPlayers(dwarf);
        quest.addPlayerToPlayers(warlock);
        quest.createDungeon();
    }

    @Test
    public void test(){
        System.out.println(quest.battle());
    }
}
