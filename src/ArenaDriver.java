import java.util.LinkedList;

public class ArenaDriver {
    public static void main(String[] args){
        LinkedList<CharacterInterface> contestants = new LinkedList<CharacterInterface>();

        Character oliver = new Character("Oliver", 0, 0);
        Hero drG = new Hero("Dr.G", 1000, 1000000);

        contestants.add(oliver);
        contestants.add(drG);

    }
}
