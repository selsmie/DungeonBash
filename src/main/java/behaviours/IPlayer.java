package behaviours;

import monsters.Monster;

public interface IPlayer {
    String getName();
    int getWeaponDamage();
    int getHp();
    void isHealed(int healing);
    void addTreasureToPurse(double treasure);

    void attack(Monster monster, int weaponDamage);
}
