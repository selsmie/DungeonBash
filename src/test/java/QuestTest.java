import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import Equipment.Weapon;
import Equipment.WeaponType;
import adventurers.Knight;
import monsters.Troll;
import org.junit.Before;
import org.junit.Test;
import quest.Quest;
import room.MonsterRoom;

import static org.junit.Assert.assertEquals;

public class QuestTest {

    Knight knight;
    Troll troll;
    MonsterRoom room;
    MonsterWeapon mWeapon;
    Weapon weapon;
    Quest quest;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.SWORD);
        knight = new Knight("Harold", 100, weapon);
        mWeapon = new MonsterWeapon(MonsterWeaponType.SPEAR);
        troll = new Troll(100, mWeapon);
        room = new MonsterRoom("Bridge", troll);
        quest = new Quest(knight, room);
    }

    @Test
    public void questHasKnight(){
        assertEquals("Harold", quest.getPlayerName());
    }

    @Test
    public void questHasRoom(){
        assertEquals("Bridge", quest.getRoomName());
    }
}
