/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * A character has a name, hitPoints, strength, and an alive status
 *
 * Author: Bailee Bartash
 * Date: 11/4/21
 * Revised: 11/10/21
 */

public class Character implements CharacterInterface {
    private String name;
    private double hitPoints;
    private double strength;
    private boolean alive;

    public Character(String name, double hp, double strength){
        this.name = name;
        this.hitPoints = hp;
        this.strength = strength;
        this.alive = true;
    }

    // getters
    public String getName() {
        return name;
    }
    public double getHitPoints() {
        return hitPoints;
    }
    public double getStrength() {
        return strength;
    }
    public boolean isAlive() {
        return alive;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setHitPoints(double hitPoints) {
        if (hitPoints < 0) {
            hitPoints = 0;
        }
        if(hitPoints > 999) {
            hitPoints = 999;
        }
        if (hitPoints == 0) {
            alive = false;
        }
        this.hitPoints = hitPoints;
    }
    public void setStrength(double strength) {
        this.strength = strength;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public double attack() {
        return (double)((Math.random() * (strength - 1)) + 1);
    }

    public void takeDamage()
    {
        double damage = attack();
        setHitPoints(hitPoints - damage);
    }

    public String toString() {
        return "Name: " + name
                + "\nHit Points: " + hitPoints
                + "\nStrength: " + strength;
    }
}