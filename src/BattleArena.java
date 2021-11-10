import java.util.LinkedList;
import java.lang.Math;


public class BattleArena {
    LinkedList<Character> heroes;
    LinkedList<Character> badguys;
    LinkedList<Weapon> weaponRack;
    CharacterInterface winner;

    public BattleArena(LinkedList<Character> heroes,
                       LinkedList<Character> badguys,
                       LinkedList<Weapon> weaponRack){
        this.heroes = heroes;
        this.badguys = badguys;
        this.weaponRack = weaponRack;
    }


    public void FIGHT(){

        //LOOP WHILE size of heroes or badguys is greater than 0:

        //get random index for a hero
        //get random index for a bad guy
        int hero_index = 0;// = random number from the size of hero linked list
        int badguy_index = 0;// = random number from the size of hero linked list

        int result = two_v_two_FIGHT(hero_index, badguy_index);

        //the result is the index of the player who lost:
        if(result == 0){this.heroes.remove(hero_index);}
        if(result == 1){this.badguys.remove(badguy_index);}

        //rest the health of the player who is still alive:



    }

    public int two_v_two_FIGHT(int hero_index, int badguy_index){


        if(!this.heroes.get(hero_index).isAlive()) return 0;

        else if(!this.badguys.get(badguy_index).isAlive()) return 1;

        return -1;
    }

    public void AnnounceContestants(){
        //loops through the contestants in the arena.

        System.out.println("******ANNOUNCING OUR HEROES******");
        int count = 1;
        for(CharacterInterface C : this.heroes){
            System.out.println(String.format("Contestant #%d:", count++));
            System.out.println(C);
        }

        System.out.println("******ANNOUNCING OUR BAD GUYS******");
        System.out.println("(boos from the crowd)");
        count = 1;
        for(CharacterInterface C : this.badguys){
            System.out.println(String.format("Contestant #%d:", count++));
            System.out.println(C);
        }

        System.out.println("******AVAILABLE WEAPONS FOR OUR HEROES*****");
        for(Weapon W : this.weaponRack){
            System.out.println(W);
        }

    }

    public void AnnounceWinner(){
        //displays the winner and their weapon, fireworks, boom.
        System.out.println("\n\nAND THE WINNER IS: ");
        System.out.println("(rumbling)");

        System.out.println(this.winner);

    }
    public double getRandomAttack(CharacterInterface contestant) {

        if (contestant instanceof BadGuy) {
            //attack function call for the badguy
        }


        if (contestant instanceof Hero) {
            //hand of god roll:
            int handofgod = (int) Math.floor(Math.random() * 100) % 2;

            //attack function call for the hero

        }
        return 0d;
    }


}
