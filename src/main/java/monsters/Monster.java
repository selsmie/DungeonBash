package monsters;

import Equipment.MonsterWeaponType;
import behaviours.IDefend;
import behaviours.IMonster;
import behaviours.IMonsterWeapon;

public class Monster implements IMonster, IDefend {
    private int hp;
    private IMonsterWeapon weapon;

    public Monster(int hp, IMonsterWeapon weapon) {
        this.hp = hp;
        this.weapon = weapon;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public MonsterWeaponType getMonsterWeapon(){
        return weapon.getWeaponType();
    }

    public int getWeaponDamage(){
        return this.weapon.getWeaponDamage();
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
