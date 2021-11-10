import java.util.LinkedList;
import java.lang.Math;


public class BattleArena {
    LinkedList<CharacterInterface> heroes;
    LinkedList<CharacterInterface> badguys;
    LinkedList<Weapon> weaponRack;
    CharacterInterface winner;

    public BattleArena(LinkedList<CharacterInterface> heroes,
                       LinkedList<CharacterInterface> badguys,
                       LinkedList<Weapon> weaponRack){
        this.heroes = heroes;
        this.badguys = badguys;
        this.weaponRack = weaponRack;
    }

    public void FIGHT(){
        //runs the contestants through the ringer, there will be only one winner
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

