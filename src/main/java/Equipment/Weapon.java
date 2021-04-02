package Equipment;

public class Weapon  {

    WeaponType weaponType;

    public Weapon(WeaponType weaponType){
        this.weaponType = weaponType;
    }

    public int getWeaponDamage(){
        return this.weaponType.getAttackDamage();
    }

    public WeaponType getWeapon(){
        return this.weaponType;
    }
}
