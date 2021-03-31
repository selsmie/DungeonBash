package monsters;

import Equipment.MonsterWeaponType;
import behaviours.IMonster;
import behaviours.IMonsterWeapon;

public class Monster implements IMonster {
    private int hp;
    private IMonsterWeapon weapon;

    public Monster(int hp, IMonsterWeapon weapon) {
        this.hp = hp;
        this.weapon = weapon;

    }

    public int getHp() {
        return hp;
    }

    public MonsterWeaponType getMonsterWeapon(){
        return weapon.getWeaponType();
    }

    public int getWeaponDamage(){
        return this.weapon.getWeaponDamage();
    }
}
