package quest;

import adventurers.*;
import behaviours.IDefend;
import monsters.Monster;
import room.MonsterRoom;
import room.Room;

public class Quest {

    Person player;
    Room room;

    public Quest(Person player, Room room){
        this.player = player;
        this.room = room;
    }

    public String getPlayerName() {
        if (this.player instanceof Fighter){
            return (((Fighter) this.player).getName());
        } else if (this.player instanceof Spellcaster){
            return (((Spellcaster) this.player).getName());
        } else {
            return (((Cleric) this.player).getName());
        }
    }

    public String getRoomName() {
       return room.getRoomName();
    }

    public int getMonsterAttack() {
        int damage = 0;
        if (this.room instanceof MonsterRoom){
            damage = (((MonsterRoom) this.room).getWeaponDamage());
        }
        return damage;
    }

    public int getPlayerAttack() {
        if (this.player instanceof Fighter){
            return (((Fighter) this.player).getWeaponDamage());
        } else if (this.player instanceof Spellcaster){
            return (((Spellcaster) this.player).getSpellDamage());
        } else {
            return 0;
        }
    }

    public int getPlayerHp() {
        return (((Person) this.player).getHp());
    }

    public void monsterAttacksPlayer() {
        int monsterAttack = this.getMonsterAttack();
//        this.player.takesDamage(monsterAttack);
        ((IDefend) this.player).takesDamage(monsterAttack);
    }

    public void playerAttack() {
        int playerAttack = this.getPlayerAttack();
        Monster monster = ((MonsterRoom) this.room).getMonster();
        ((IDefend) monster).takesDamage(playerAttack);
    }

    public int getMonsterHp() {
        int hp = 0;
        if (this.room instanceof MonsterRoom){
            hp = (((MonsterRoom) this.room).getMonsterHp());
        }
        return hp;
    }
}
