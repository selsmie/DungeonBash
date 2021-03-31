package Equipment;

public enum FamiliarType {
    OGRE(10),
    DRAGON(40);

    private final int health;

    FamiliarType(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }
}
