package Monster;

import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import monsters.Kobold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KoboldTest {

    Kobold kobold;
    MonsterWeapon weapon;

    @Before
    public void before() {
        weapon = new MonsterWeapon(MonsterWeaponType.HALBERD);
        kobold = new Kobold(10, weapon);

    }

    @Test
    public void canHaveHp() {
        assertEquals(10, kobold.getHp());
    }

    @Test
    public void canHaveWeapon() {
        assertEquals(MonsterWeaponType.HALBERD, kobold.getMonsterWeapon());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(18, kobold.getWeaponDamage());
    }
}
