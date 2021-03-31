package room;

import behaviours.IRoom;

public abstract class Room {
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
}
