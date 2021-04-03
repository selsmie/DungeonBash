import Equipment.*;
import adventurers.Dwarf;
import adventurers.Knight;
import adventurers.Warlock;
import org.junit.Before;
import org.junit.Test;
import quest.MultiPlayerQuest;

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
        spell = new Spell(SpellType.FIREBALL);
        knight = new Knight("Tim", 75, sword);
        dwarf = new Dwarf("Pete", 105, axe);
        cat = new Familiar(FamiliarType.DRAGON);
        warlock = new Warlock("JimBob", 50, spell, cat);
        quest = new MultiPlayerQuest();
        quest.addPlayerToPlayers(knight);
        quest.addPlayerToPlayers(dwarf);
        quest.addPlayerToPlayers(warlock);
        quest.createDungeon(4);
    }

    @Test
    public void test(){
        quest.battle();
    }
}
