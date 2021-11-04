import java.util.Random;

public class Character implements CharacterInterface {
    private String name;
    private double hitPoints;
    private double strength;
    private boolean alive;

    public Character(String name, double hp, double strength){
        this.name = name;
        this.hitPoints = hp;
        this.strength = strength;
    }

    @Override
    public double attack() {
        return (double)((Math.random() * (strength - 1)) + 1);
    }

    public void takeDamage(int damage)
    {
        setHitPoints(hitPoints - damage);
    }

    public String toString() {
        return "Name: " + name
                + "\nHit Points: " + hitPoints
                + "\nStrength: " + strength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
