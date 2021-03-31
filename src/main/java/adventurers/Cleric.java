package adventurers;

import Equipment.HealingToolType;
import behaviours.IHeal;

public class Cleric extends Person {

    private IHeal heal;
    private double holyAura;

    public Cleric(String name, int hp,IHeal heal) {
        super(name, hp);
        this.heal = heal;
        this.holyAura = 1.5;
    }

    public HealingToolType getHealingTool(){
        return this.heal.getHealingTool();
    }

    public int getHealing(){
        return this.heal.getHealing();
    }

    public void changeHealingTool(IHeal heal){
        this.heal = heal;
    }
}
