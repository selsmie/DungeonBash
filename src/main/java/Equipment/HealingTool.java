package Equipment;

public class HealingTool {

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
