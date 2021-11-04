import java.util.LinkedList;
import java.lang.Math;

public class BattleArena {
    LinkedList<CharacterInterface> heroes;
    LinkedList<CharacterInterface> badguys;
    LinkedList<Weapon> weaponRack;

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
    }

    public void AnnounceWinner(){
        //displays the winner and their weapon, fireworks, boom.
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
