package Equipment;

public enum MonsterWeaponType {
    HALBERD(18),
    SPEAR(15),
    BOW(12),
    CUDGEL(5);


    private final int attack;

    MonsterWeaponType(int attack){
        this.attack = attack;
    }

    public int getAttackDamage(){
        return this.attack;
    }
}
