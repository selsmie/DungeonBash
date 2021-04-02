package quest;

import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import behaviours.IFighter;
import behaviours.IRoom;
import monsters.Kobold;
import monsters.Monster;
import monsters.Troll;
import room.MonsterRoom;
import room.TreasureRoom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MultiPlayerQuest {

    private ArrayList<IFighter> players;
    private ArrayList<IRoom> rooms;

    public MultiPlayerQuest(){
        this.players = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addPlayerToPlayers(IFighter player){
        this.players.add(player);
    }

    public void addRoomToRooms(IRoom room){
        this.rooms.add(room);
    }

    public ArrayList<IRoom> createDungeon(){
        int counter = 0;
        while (counter < 4) {
            this.addRoomToRooms(createRandomRoom());
            counter++;
        }
        return this.rooms;
    }

    public IRoom createRandomRoom(){
        Random rand = new Random();
        int weaponRandom = rand.nextInt(4);
        int nameRandom = rand.nextInt(5);
        int monsterRandom = rand.nextInt(2);

        List<String> roomNames = Arrays.asList("Bridge", "Crypt", "Hall", "Bed Chamber", "Cavern");

        MonsterWeapon halberd = new MonsterWeapon(MonsterWeaponType.HALBERD);
        MonsterWeapon spear = new MonsterWeapon(MonsterWeaponType.SPEAR);
        MonsterWeapon bow = new MonsterWeapon(MonsterWeaponType.BOW);
        MonsterWeapon cudgel = new MonsterWeapon(MonsterWeaponType.CUDGEL);
        List<MonsterWeapon> mWeapons = Arrays.asList(halberd, spear, bow, cudgel);

        Troll troll = new Troll(100, mWeapons.get(weaponRandom));
        Kobold kobold = new Kobold(100, mWeapons.get(weaponRandom));

        List<Monster> monsters = Arrays.asList(troll, kobold);

        TreasureRoom tRoom = new TreasureRoom(roomNames.get(nameRandom));
        MonsterRoom mRoom = new MonsterRoom(roomNames.get(nameRandom), monsters.get(monsterRandom));

        List<IRoom> randomRoom = Arrays.asList(tRoom, mRoom);

        return randomRoom.get(monsterRandom);
    }

    public void battle(){
        for (IRoom room : this.rooms){
            while (room.getMonsterHp() > 0) {
                for (IFighter player : this.players) {
                    if (player.getHp() > 0) {
                        player.attack(room.getMonster());
                    } else {
                        System.out.println(player.getName() + " dies...");
                    }
                }
                if (room.getMonsterHp() > 0) {
                    room.monsterAttack(this.players);
                    System.out.println(room.getMonster() + " Attacks");
                }
            }
            double treasure = room.getTreasure();
            for (IFighter player : this.players){
                player.addTreasureToPurse(treasure / this.players.size());
            }
            System.out.println("The room is clear");
        }
    }
}
