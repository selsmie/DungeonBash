package behaviours;

public interface IFighter {
    String getName();
    int getWeaponDamage();
    int getHp();
    void isHealed(int healing);
    void addTreasureToPurse(double treasure);
}
