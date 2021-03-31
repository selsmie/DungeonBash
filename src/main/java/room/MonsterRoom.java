package room;

import Equipment.MonsterWeaponType;
import behaviours.IMonster;


public class MonsterRoom extends Room {

    private IMonster monster;

    public MonsterRoom(String name, IMonster monster) {
        super(name);
        this.monster = monster;
    }

    public int getMonsterHp() {
        return monster.getHp();
    }

    public int getWeaponDamage(){
        return monster.getWeaponDamage();
    }

    public MonsterWeaponType getMonsterWeapon() {
        return monster.getMonsterWeapon();
    }
}
