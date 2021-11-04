import java.util.LinkedList;

public class ArenaDriver {
    public static void main(String[] args){
        //Create our list of heroes and bad guys:
        LinkedList<CharacterInterface>  heroes = new LinkedList<CharacterInterface>();
        LinkedList<CharacterInterface>  badguys = new LinkedList<CharacterInterface>();

        //Populate our rack of weapons:
        LinkedList<Weapon> weaponRack = ArenaDriver.getWeaponRack();
        Character oliver = new Character("Oliver", 0, 0);
        Hero drG = new Hero("Dr.G", 1000, 1000000, 10);

        //add some contestants:
        heroes.add(oliver);
        badguys.add(drG);

        //The basic structure of the Arena function calls:
        BattleArena ThunderDome = new BattleArena(heroes, badguys, weaponRack);
        ThunderDome.AnnounceContestants();
        ThunderDome.FIGHT();
        ThunderDome.AnnounceWinner();



    }

    public static LinkedList<Weapon> getWeaponRack() {
        LinkedList<Weapon> weaponRack = new LinkedList<Weapon>();
        weaponRack.add(new Weapon("a", 10));
        weaponRack.add(new Weapon("b", 10));
        weaponRack.add(new Weapon("c", 10));
        weaponRack.add(new Weapon("d", 10));
        weaponRack.add(new Weapon("e", 10));

        return weaponRack;
    }
}



