import Equipment.*;
import adventurers.Cleric;
import adventurers.Knight;
import monsters.Troll;
import org.junit.Before;
import org.junit.Test;
import quest.SinglePlayerQuest;
import room.MonsterRoom;

import static org.junit.Assert.assertEquals;

public class SinglePlayerQuestTest {

    Knight knight;
    Cleric cleric;
    Troll troll;
    MonsterRoom room;
    MonsterWeapon mWeapon;
    Weapon weapon;
    SinglePlayerQuest quest;
    SinglePlayerQuest quest1;
    HealingTool healing;
    HealingTool healing2;

    @Before
    public void before() {
        weapon = new Weapon(WeaponType.SWORD);
        healing = new HealingTool(HealingToolType.POTION);
        healing2 = new HealingTool(HealingToolType.HERB);
        knight = new Knight("Harold", 100, weapon);
        cleric = new Cleric("Tod", 100, healing);
        mWeapon = new MonsterWeapon(MonsterWeaponType.SPEAR);
        troll = new Troll(100, mWeapon);
        room = new MonsterRoom("Bridge", troll);
        quest = new SinglePlayerQuest(knight, room);
        quest1 = new SinglePlayerQuest(cleric, room);
    }

    @Test
    public void questHasKnight() {
        assertEquals("Harold", quest.getPlayerName());
    }

    @Test
    public void questHasRoom() {
        assertEquals("Bridge", quest.getRoomName());
    }

    @Test
    public void questHasTrollAttack() {
        assertEquals(15, quest.getMonsterAttack());
    }

    @Test
    public void questHasFighterAttack() {
        assertEquals(15, quest.getPlayerAttack());
    }

    @Test
    public void playerHasHp() {
        assertEquals(100, quest.getPlayerHp());
    }

    @Test
    public void playerTakesDamage() {
        quest.monsterAttacksPlayer();
        assertEquals(95, quest.getPlayerHp());
    }

    @Test
    public void playerTakesDamage1() {
        quest1.monsterAttacksPlayer();
        assertEquals(90, quest1.getPlayerHp());
    }

    @Test
    public void playerAttacks() {
        quest.playerAttack();
        assertEquals(85, quest.getMonsterHp());
    }

    @Test
    public void canHeal() {
        quest.monsterAttacksPlayer();
        cleric.heals(knight);
        assertEquals(100, knight.getHp());
    }

    @Test
    public void canHealSelf() {
        quest1.monsterAttacksPlayer();
        cleric.changeHealingTool(healing2);
        cleric.heals(cleric);
        assertEquals(95, cleric.getHp());
    }

    @Test
    public void canBattle() {
        assertEquals("Harold has defeated the Monster", quest.battle());
        System.out.println(knight.getPurse());
    }

    @Test
    public void canLoseBattle() {
        assertEquals("Tod dies...", quest1.battle());
    }
}
