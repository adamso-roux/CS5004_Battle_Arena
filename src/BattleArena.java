import java.util.LinkedList;
import java.lang.Math;
import java.util.Random;


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

        while((this.heroes.size() > 0) || (this.badguys.size() > 0)) {
            //get random index for a hero
            //get random index for a bad guy
            int hero_index = (int)Math.floor(Math.random() * this.heroes.size());
            int badguy_index = (int)Math.floor(Math.random() * this.heroes.size());

            int result = two_v_two_FIGHT(hero_index, badguy_index);

            //the result is the index of the player who lost:
            if (result == 0) {
                this.heroes.remove(hero_index);
                this.badguys.get(badguy_index).revive();
            }
            if (result == 1) {
                this.badguys.remove(badguy_index);
                this.heroes.get(hero_index).revive();
            }

        }



    }

    public int two_v_two_FIGHT(int hero_index, int badguy_index){


        System.out.println("FIGHT");
        Random rand = new Random();

        Character c1 = heroes.get(hero_index);
        Character c2 = badguys.get(badguy_index);

        double damagec1 = rand.nextInt((int) c1.getStrength());
        double damagec2 = rand.nextInt((int) c2.getStrength());


        while(c1.isAlive()  || c2.isAlive()) {
            System.out.println(c1.getName() + " Strength: " + c1.getHitPoints() + " " + c2.getName() + " Strength: " + c2.getHitPoints());
            System.out.println(c1.getName() + " Attacks " + c2.getName());
            c2.takeDamage(damagec2);
            System.out.println(c1.getName() + " Strength: " + c1.getHitPoints() + " " + c2.getName() + " Strength: " + c2.getHitPoints());
            System.out.println(c2.getName() + " Attacks " + c1.getName());
            c1.takeDamage(damagec1);

            if (c1.isAlive() == false) {
                System.out.println(c2.getName() + " Wins");
            }

            if (c2.isAlive() == false) {
                System.out.println(c1.getName() + " Wins");
            }
        }
        if(!this.heroes.get(hero_index).isAlive()) return 0;

        else return 1;

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
//    public double getRandomAttack(Character contestant) {
//
//        if (contestant instanceof BadGuy) {
//            //attack function call for the badguy
//        }
//
//
//        if (contestant instanceof Hero) {
//            //hand of god roll:
//            int handofgod = (int) Math.floor(Math.random() * 100) % 2;
//
//            //attack function call for the hero
//
//        }
//        return 0d;
//    }


}
