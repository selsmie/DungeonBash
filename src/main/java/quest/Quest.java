package quest;

import adventurers.Cleric;
import adventurers.Fighter;
import adventurers.Person;
import adventurers.Spellcaster;
import room.Room;

public class Quest {

    Person player;
    Room room;

    public Quest(Person player, Room room){
        this.player = player;
        this.room = room;
    }

    public String getPlayerName() {
        if (this.player instanceof Fighter){
            return (((Fighter) this.player).getName());
        } else if (this.player instanceof Spellcaster){
            return (((Spellcaster) this.player).getName());
        } else {
            return (((Cleric) this.player).getName());
        }
    }

    public String getRoomName() {
       return room.getRoomName();
    }
}
