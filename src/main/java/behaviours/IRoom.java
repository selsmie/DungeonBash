package behaviours;

import monsters.Monster;

public interface IRoom {
    int getWeaponDamage();
    int getMonsterHp();
    Monster getMonster();
    String getRoomName();
    double getTreasure();
}
