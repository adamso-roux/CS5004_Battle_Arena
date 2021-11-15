import java.util.LinkedList;
import java.io.File;
import java.io.IOException;
import java.lang.Math;
import java.util.Random;
// new stuff



public class BattleArena {
    LinkedList<Hero> heroes;
    LinkedList<BadGuy> badguys;
    LinkedList<Weapon> weaponRack;
    CharacterInterface winner;

    public BattleArena(LinkedList<Hero> heroes,
                       LinkedList<BadGuy> badguys,
                       LinkedList<Weapon> weaponRack){
        this.heroes = heroes;
        this.badguys = badguys;
        this.weaponRack = weaponRack;
    }


    public void FIGHT(){

        //LOOP WHILE size of heroes or badguys is greater than 0:

        int round_number = 0;

        while((this.heroes.size() > 0) && (this.badguys.size() > 0)) {

            Random rand = new Random();

            int hero_index = rand.nextInt(this.heroes.size());//(int)Math.floor(Math.random() * this.heroes.size());

            int badguy_index = rand.nextInt(this.badguys.size());//(int)Math.floor(Math.random() * this.heroes.size());

            System.out.println("\nBEGIN ROUND " + round_number++);
            int result = two_v_two_FIGHT(hero_index, badguy_index);

            //the result is the index of the player who lost:
            if (result == 1) {
                this.heroes.remove(hero_index);
                this.badguys.get(badguy_index).revive();
            }
            if (result == 0) {
                this.badguys.remove(badguy_index);
                this.heroes.get(hero_index).revive();
            }
        }

    }

    public int two_v_two_FIGHT(int hero_index, int badguy_index){


        Random rand = new Random();

        Hero c1 = heroes.get(hero_index);
        Character c2 = badguys.get(badguy_index);
        Weapon w0 = weaponRack.get(rand.nextInt(this.weaponRack.size()));

        c1.setWeapon(w0);

        System.out.println(String.format("%s VERSUS %s", c1.getName(), c2.getName()));

        System.out.println(c1.getName() +" has equipped " + w0);


        while(c1.isAlive()  && c2.isAlive()) {

            boolean special = rand.nextBoolean();

            System.out.println(c1.getName() + " Attacks " + c2.getName());
            //System.out.println(special);
        
            c2.takeDamage(c1.attack(special));

            System.out.println(c2.getName() + " Attacks " + c1.getName());
            c1.takeDamage(c2.attack());


            if (c1.isAlive() == false) {
                System.out.println(c2.getName() + " Wins");
            }

            if (c2.isAlive() == false) {
                System.out.println(c1.getName() + " Wins");
            }

            System.out.println(c1.getName() + " is at " + c1.getHitPoints());
            System.out.println(c2.getName() + " is at " + c2.getHitPoints());
        }
        if(!this.heroes.get(hero_index).isAlive()) { 
        	this.winner = (CharacterInterface) this.heroes.get(hero_index);
        	  	return 1;
        }else {
        	this.winner = (CharacterInterface) this.heroes.get(hero_index);
        return 0;
    }
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
