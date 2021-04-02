package room;

import Equipment.MonsterWeaponType;
import behaviours.IPlayer;
import behaviours.IRoom;
import monsters.Monster;

import java.util.ArrayList;

public abstract class Room implements IRoom{
    private double treasure;
    private String name;


    public Room(String name) {
        this.name = name;
        this.treasure = Math.ceil(Math.random() * 100);
    }

    public double getTreasure() {
        return treasure;
    }

    public String getRoomName() {
        return name;
    }

    public abstract Monster getMonster();

    public abstract int getMonsterHp();

    public abstract int getWeaponDamage();

    public abstract MonsterWeaponType getMonsterWeapon();


}
