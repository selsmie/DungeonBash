package adventurers;

public abstract class Person {

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

}
