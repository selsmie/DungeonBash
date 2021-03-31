package quest;

import behaviours.IPlayer;
import behaviours.IRoom;

public class Quest {

    IPlayer player;
    IRoom room;

    public Quest(IPlayer player, IRoom room){
        this.player = player;
        this.room = room;
    }
}
