package Monster;

import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import monsters.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    MonsterWeapon weapon;

    @Before
    public void before(){
        weapon = new MonsterWeapon(MonsterWeaponType.SPEAR);
        troll = new Troll(100, weapon);
    }

    @Test
    public void hasHp(){
        assertEquals(100, troll.getHp());
    }

    @Test
    public void hasWeapon(){
        assertEquals(MonsterWeaponType.SPEAR, troll.getMonsterWeapon());
    }

    @Test
    public void weaponHasAttackDamage(){
        assertEquals(15, troll.getWeaponDamage());
    }
}
