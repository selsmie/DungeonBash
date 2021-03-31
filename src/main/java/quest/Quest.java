package quest;

import adventurers.*;
import behaviours.IDefend;
import behaviours.IFighter;
import behaviours.IRoom;
import monsters.Monster;
import room.MonsterRoom;
import room.Room;

public class Quest {

    IFighter player;
    IRoom room;

    public Quest(IFighter player, IRoom room){
        this.player = player;
        this.room = room;
    }

    public String getPlayerName() {
//        if (this.player instanceof Fighter){
//            return (((Fighter) this.player).getName());
//        } else if (this.player instanceof Spellcaster){
//            return (((Spellcaster) this.player).getName());
//        } else {
//            return (((Cleric) this.player).getName());
//        }
        return this.player.getName();
    }

    public String getRoomName() {
       return room.getRoomName();
    }

    public int getMonsterAttack() {
//        int damage = 0;
//        if (this.room instanceof MonsterRoom){
//            damage = (((MonsterRoom) this.room).getWeaponDamage());
//        }
//        return damage;
        return this.room.getWeaponDamage();
    }

    public int getPlayerAttack() {
//        if (this.player instanceof Fighter){
//            return (((Fighter) this.player).getWeaponDamage());
//        } else if (this.player instanceof Spellcaster){
//            return (((Spellcaster) this.player).getSpellDamage());
//        } else {
//            return 0;
//        }
        return this.player.getWeaponDamage();
    }

    public int getPlayerHp() {
        return this.player.getHp();
    }

    public void monsterAttacksPlayer() {
        int monsterAttack = this.getMonsterAttack();
//        this.player.takesDamage(monsterAttack);
        ((IDefend) this.player).takesDamage(monsterAttack);
    }

    public void playerAttack() {
        int playerAttack = this.getPlayerAttack();
        Monster monster = this.room.getMonster();
        ((IDefend) monster).takesDamage(playerAttack);
    }

    public int getMonsterHp() {
//        int hp = 0;
//        if (this.room instanceof MonsterRoom){
//            hp = (((MonsterRoom) this.room).getMonsterHp());
//        }
//        return hp;
        return this.room.getMonsterHp();
    }
}
