package Room;

import org.junit.Before;
import org.junit.Test;
import room.TreasureRoom;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom room;

    @Before
    public void before(){
        room = new TreasureRoom("Hallway");
    }

    @Test
    public void hasName(){
        assertEquals("Hallway", room.getRoomName());
    }

    @Test
    public void hasTreasure(){
        System.out.println("TreasureRoom: " + room.getTreasure());
    }
}
