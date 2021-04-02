package behaviours;

import monsters.Monster;

import java.util.ArrayList;

public interface IRoom {
    int getWeaponDamage();
    int getMonsterHp();
    Monster getMonster();
    String getRoomName();
    double getTreasure();
}
