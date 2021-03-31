package Room;

import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import monsters.Kobold;
import org.junit.Before;
import org.junit.Test;
import room.MonsterRoom;
import room.Room;
import room.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class MonsterRoomTest {

    MonsterRoom room;
    Kobold kobold;
    MonsterWeapon weapon;


    @Before
    public void before(){
        weapon = new MonsterWeapon(MonsterWeaponType.HALBERD);
        kobold = new Kobold(10, weapon);
        room = new MonsterRoom("Hallway",kobold);
    }

    @Test
    public void roomHasName(){
        assertEquals("Hallway", room.getRoomName());
    }

    @Test
    public void roomHasMonster(){
        assertEquals(10, room.getMonsterHp());
    }

    @Test
    public void roomHastreasure(){
        System.out.println("MonsterRoom: " + room.getTreasure());
    }

}
