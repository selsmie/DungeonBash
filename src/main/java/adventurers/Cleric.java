package adventurers;

import Equipment.HealingTool;
import Equipment.HealingToolType;
import behaviours.IPlayer;

public class Cleric extends Person{

    private HealingTool heal;
    private double holyAura;

    public Cleric(String name, int hp, HealingTool heal) {
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

    public void changeHealingTool(HealingTool heal){
        this.heal = heal;
    }

    public int getWeaponDamage(){
        return 0;
    }

    public void takesDamage(double attack){
        attack = attack / this.holyAura;
        super.takesDamage(attack);
    }

    public void heals(IPlayer player){
        player.isHealed(this.getHealing());
    }
}
