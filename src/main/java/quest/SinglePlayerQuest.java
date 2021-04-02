package quest;

import adventurers.*;
import behaviours.IDefend;
import behaviours.IFighter;
import behaviours.IRoom;
import monsters.Monster;
import room.MonsterRoom;
import room.Room;

public class SinglePlayerQuest {

    IFighter player;
    IRoom room;

    public SinglePlayerQuest(IFighter player, IRoom room){
        this.player = player;
        this.room = room;
    }

    public String getPlayerName() {
        return this.player.getName();
    }

    public String getRoomName() {
       return room.getRoomName();
    }

    public int getMonsterAttack() {
        return this.room.getWeaponDamage();
    }

    public int getPlayerAttack() {
        return this.player.getWeaponDamage();
    }

    public int getPlayerHp() {
        return this.player.getHp();
    }

    public void monsterAttacksPlayer() {
        int monsterAttack = this.getMonsterAttack();
        ((IDefend) this.player).takesDamage(monsterAttack);
    }

    public void playerAttack() {
        int playerAttack = this.getPlayerAttack();
        Monster monster = this.room.getMonster();
        ((IDefend) monster).takesDamage(playerAttack);
    }

    public int getMonsterHp() {
        return this.room.getMonsterHp();
    }

    public String battle(){
        while (this.getPlayerHp() > 0 && this.getMonsterHp() > 0){
            this.playerAttack();
            this.monsterAttacksPlayer();
        }
        if (this.getPlayerHp() == 0){
            return this.player.getName() + " dies...";
        } else {
            this.player.addTreasureToPurse(this.room.getTreasure());
            return this.player.getName() + " has defeated the Monster";
        }
    }
}
