package Equipment;

import behaviours.IHeal;

public class HealingTool implements IHeal {

    private HealingToolType healingToolType;

    public HealingTool(HealingToolType healingToolType){
        this.healingToolType = healingToolType;
    }

    public HealingToolType getHealingTool(){
        return this.healingToolType;
    }

    public int getHealing(){
        return this.healingToolType.getHealing();
    }
}
