package adventurers;

import behaviours.IDefend;
import behaviours.IFighter;

public abstract class Person implements IDefend, IFighter {


    private String name;
    private double purse;
    private int hp;
    private final int maxHp;

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.purse = 0.0;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public void takesDamage(double attack){
        int hp = this.getHp();
        if (attack >= hp){
                this.setHp(0);
        } else {
                hp -= attack;
                this.setHp(hp);
        }
    }

    public double getPurse() {
        return purse;
    }

    public void addTreasureToPurse(double treasure) {
        this.purse += treasure;
    }

    public void isHealed(int healingCapacity){
        if (healingCapacity + this.hp >= this.maxHp){
            this.setHp(this.maxHp);
        } else {
            this.setHp(this.hp + healingCapacity);
        }
    }

}
