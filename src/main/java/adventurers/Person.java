package adventurers;

import behaviours.IDefend;

public abstract class Person implements IDefend {

    private String name;
    private int hp;

    public Person(String name, int hp) {
        this.name = name;
        this.hp = hp;
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

    public void takesDamage(int attack){
        int hp = this.getHp();
        if (attack >= hp){
                this.setHp(0);
        } else {
                hp -= attack;
                this.setHp(hp);
        }
    }

}
