package quest;

import Equipment.MonsterWeapon;
import Equipment.MonsterWeaponType;
import behaviours.IPlayer;
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

    private ArrayList<IPlayer> players;
    private ArrayList<IRoom> rooms;

    public MultiPlayerQuest(){
        this.players = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addPlayerToPlayers(IPlayer player){
        this.players.add(player);
    }

    public void addRoomToRooms(IRoom room){
        this.rooms.add(room);
    }

    public ArrayList<IRoom> createDungeon(int levels){
        int counter = 0;
        while (counter < levels) {
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

        Troll troll = new Troll(1000, mWeapons.get(weaponRandom));
        Kobold kobold = new Kobold(1000, mWeapons.get(weaponRandom));

        List<Monster> monsters = Arrays.asList(kobold, troll);

        TreasureRoom tRoom = new TreasureRoom(roomNames.get(nameRandom));
        MonsterRoom mRoom = new MonsterRoom(roomNames.get(nameRandom), monsters.get(monsterRandom));

        List<IRoom> randomRoom = Arrays.asList(tRoom, mRoom);

        return randomRoom.get(monsterRandom);
    }

    public void battle(){
        for (IRoom room : this.rooms){

            if (room.getMonsterHp() > 0 && this.players.size() > 0){
                System.out.println("Monster!!! Let's attack!!!");
            } else if (room.getMonsterHp() == 0 && this.players.size() > 0){
                System.out.println("The room is empty search for treasure!");
            } else if (this.players.size() == 0){
                System.out.println("RIP");
                break;
            }
            boolean alive = true;
            while (room.getMonsterHp() > 0 && alive) {

                for (IPlayer player : this.players) {

                    if (player.getHp() > 0) {
                        player.attack(room.getMonster(), player.getWeaponDamage());
                    }
                }

                for (int i = (this.players.size() - 1); i >= 0 ; i--){
                    if (this.players.get(i).getHp() == 0){
                        System.out.println(this.players.get(i).getName() + " died!");
                        this.players.remove(this.players.get(i));
                    }
                }

                if (this.players.size() == 0){
                    alive = false;
                    break;
                }

                if (room.getMonsterHp() > 0 && this.players.size() > 0) {
                    Random random = new Random();
                    int rand = random.nextInt(this.players.size());
                    Monster monster = room.getMonster();
                    monster.attack(this.players.get(rand), monster.getWeaponDamage());
                }

            }
            if (this.players.size() > 0){
                double treasure = room.getTreasure();
                for (IPlayer player : this.players){
                    if (player.getHp() > 0) {
                        player.addTreasureToPurse(treasure / this.players.size());
                    }
                }
                System.out.println("Treasure collected");
            }
        }


        if (this.players.size() > 0){
            System.out.println("You have completed the dungeon!");
        }
        this.rooms.clear();
        this.players.clear();

    }
}
