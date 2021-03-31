package Equipment;

public enum WeaponType {
    SWORD(15),
    AXE(20),
    CLUB(10);

    private final int attackDamage;

    WeaponType(int attackDamage){
        this.attackDamage = attackDamage;
    }

    public int getAttackDamage(){
        return this.attackDamage;
    }
}
