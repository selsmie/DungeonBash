package Equipment;

import behaviours.IMonsterWeapon;

public class MonsterWeapon implements IMonsterWeapon {
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
