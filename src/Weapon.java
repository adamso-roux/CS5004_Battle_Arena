public class Weapon {
    private String name;
    private double strength;

    public Weapon(String name, double strength){
        this.name = name;
        this.strength = strength;
    }

    @Override
    public String toString(){
        return String.format("[Weapon Name: %s, Strength: %d]", this.name, this.strength);
    }
}
