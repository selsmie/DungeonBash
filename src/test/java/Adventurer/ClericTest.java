package Adventurer;

import adventurers.Cleric;
import Equipment.HealingTool;
import Equipment.HealingToolType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;
    HealingTool healingTool1;

    @Before
    public void before(){
        healingTool = new HealingTool(HealingToolType.POTION);
        healingTool1 = new HealingTool((HealingToolType.HERB));
        cleric = new Cleric("Barry", 50, healingTool);
    }

    @Test
    public void hasName(){
        assertEquals("Barry", cleric.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(50, cleric.getHp());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(HealingToolType.POTION, cleric.getHealingTool());
    }

    @Test
    public void healingToolHasValue(){
        assertEquals(20, cleric.getHealing());
    }

    @Test
    public void canChangeHealingItem(){
        cleric.changeHealingTool(healingTool1);
        assertEquals(HealingToolType.HERB, cleric.getHealingTool());
    }
}
