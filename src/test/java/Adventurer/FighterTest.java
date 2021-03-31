package Adventurer;

import Equipment.Weapon;
import Equipment.WeaponType;
import adventurers.Barbarian;
import adventurers.Dwarf;
import adventurers.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Knight knight;
    Dwarf dwarf;
    Barbarian barbarian;
    Weapon weapon;
    Weapon axe;
    Weapon club;

    @Before
    public void before(){
        weapon = new Weapon(WeaponType.SWORD);
        axe = new Weapon(WeaponType.AXE);
        club = new Weapon(WeaponType.CLUB);
        knight = new Knight("Harold", 6, weapon);
        dwarf = new Dwarf("Geoff", 10000, axe);
        barbarian = new Barbarian("Ted", 50, club);
    }

    @Test
    public void hasName(){
        assertEquals("Harold", knight.getName());
        assertEquals("Geoff", dwarf.getName());
        assertEquals("Ted", barbarian.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(6, knight.getHp());
        assertEquals(10000, dwarf.getHp());
        assertEquals(50, barbarian.getHp());
    }

    @Test
    public void canHaveWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapon());
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
        assertEquals(WeaponType.CLUB, barbarian.getWeapon());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(15, knight.getWeaponDamage());
        assertEquals(20, dwarf.getWeaponDamage());
        assertEquals(10, barbarian.getWeaponDamage());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(axe);
        assertEquals(WeaponType.AXE, knight.getWeapon());
    }

}
