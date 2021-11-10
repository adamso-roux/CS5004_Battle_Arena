/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * A bad guy is a character who says a catch phrase when attacking
 *
 * Author: Bailee Bartash
 * Date: 11/4/21
 * Revised: 11/10/21
 */
public class BadGuy extends Character{

    //making a constructor that matches the super:
    public BadGuy(String name, double hp, double strength) {
        super(name, hp, strength);
    }

    // five random catch phrases that a villian could say
    private String[] phrase = {
            "Mwahahahaha!",
            "You've failed the synthesis!",
            "I've got you now!",
            "We meet again!",
            "Luke, I am your father."
    };

    /**
     * The villian says a random catch phrase while attacking
     * @return a random double based on the character's strength, like a general character
     */
    @Override
    public double attack() {
        System.out.println(this.phrase[(int)(Math.random() * (4 - 0) + 0)]);
        return (double)((Math.random() * (super.getStrength() - 1)) + 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}