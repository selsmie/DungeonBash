package Equipment;

public class MonsterWeapon {
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
