import java.util.LinkedList;

public class ArenaDriver {
    public static void main(String[] args){
        //Create our list of heroes and bad guys:
        LinkedList<Character>  heroes = new LinkedList<Character>();
        LinkedList<Character>  badguys = new LinkedList<Character>();

        //Populate our rack of weapons:
        LinkedList<Weapon> weaponRack = ArenaDriver.getWeaponRack();
        BadGuy oliver = new BadGuy("Oliver", 100, 10);
        Hero drG = new Hero("Dr.G", 1000, 1000000, 10);

        //add some contestants:
        heroes.add(drG);
        badguys.add(oliver);
        heroes.add(drG);
        badguys.add(oliver);
        heroes.add(drG);
        badguys.add(oliver);

        //The basic structure of the Arena function calls:
        BattleArena ThunderDome = new BattleArena(heroes, badguys, weaponRack);
        ThunderDome.AnnounceContestants();
        ThunderDome.FIGHT();
        ThunderDome.AnnounceWinner();

    }

    public static LinkedList<Weapon> getWeaponRack() {
        LinkedList<Weapon> weaponRack = new LinkedList<Weapon>();
        weaponRack.add(new Melee("Sword", 22.5, 10));
        weaponRack.add(new Magic("Mjolnir", 19.0, 10));
        weaponRack.add(new Ranged("Arrow", 15.750, 10));
        weaponRack.add(new Melee("Spear", 18.25, 10));
        weaponRack.add(new Magic("Wingardium Leviosa", 21.0, 10));
        weaponRack.add(new Ranged("Grenade", 25.0, 10));

        return weaponRack;
    }
}



