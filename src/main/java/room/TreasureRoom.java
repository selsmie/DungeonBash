package room;

import Equipment.MonsterWeaponType;
import monsters.Monster;

public class TreasureRoom extends Room{
    public TreasureRoom(String name) {
        super(name);
    }

    public Monster getMonster(){
        return null;
    }

    public int getMonsterHp() {
        return 0;
    }

    public int getWeaponDamage(){
        return 0;
    }

    public MonsterWeaponType getMonsterWeapon() {
        return null;
    }
}


