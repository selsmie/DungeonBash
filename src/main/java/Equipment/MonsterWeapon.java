package Equipment;

import behaviours.IMonster;

public class MonsterWeapon implements IMonster {
    MonsterWeaponType monsterWeaponType;

    public MonsterWeapon(MonsterWeaponType monsterWeaponType){
        this.monsterWeaponType = monsterWeaponType;
    }

    public MonsterWeaponType getWeaponType(){
        return this.monsterWeaponType;
    }

    public int getWeaponDamage(){
        return this.monsterWeaponType.getAttackDamage();
    }
}
