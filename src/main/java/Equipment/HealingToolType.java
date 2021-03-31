package Equipment;

public enum HealingToolType {
    POTION(20),
    HERB(5);

    private final int healing;

    HealingToolType(int healing){
        this.healing = healing;
    }

    public int getHealing(){
        return this.healing;
    }
}
