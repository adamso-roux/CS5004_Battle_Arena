import java.util.LinkedList;

public class ArenaDriver {
    public static void main(String[] args){
        //Create our list of heroes and bad guys:
        LinkedList<Hero>  heroes = new LinkedList<Hero>();
        LinkedList<BadGuy>  badguys = new LinkedList<BadGuy>();

        //Populate our rack of weapons:
        LinkedList<Weapon> weaponRack = ArenaDriver.getWeaponRack();
        BadGuy oliver = new BadGuy("Oliver", 100, 10);
        Hero drG = new Hero("Dr.G", 100, 100, 10);
        Hero kris = new Hero("Kris Barnes", 100, 50, 10);
        BadGuy derek = new BadGuy("Derek", 100, 10);
        Hero bailee = new Hero("Bailee", 100, 99, 99);

        //add some contestants:
        heroes.add(drG);
        heroes.add(kris);
        heroes.add(bailee);

        badguys.add(oliver);
        badguys.add(derek);

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



