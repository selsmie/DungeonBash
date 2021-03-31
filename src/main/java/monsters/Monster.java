package monsters;

import Equipment.MonsterWeaponType;
import behaviours.IMonster;

public class Monster {
    private int hp;
    private IMonster weapon;

    public Monster(int hp, IMonster weapon) {
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
