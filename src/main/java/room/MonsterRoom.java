package room;

import Equipment.MonsterWeaponType;
import behaviours.IRoom;
import monsters.Monster;


public class MonsterRoom extends Room implements IRoom {

    private Monster monster;

    public MonsterRoom(String name, Monster monster) {
        super(name);
        this.monster = monster;
    }

    public Monster getMonster(){
        return this.monster;
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
