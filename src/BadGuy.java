/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * A bad guy is a character who says a catch phrase when attacking
 *
 * Author: Bailee Bartash
 * Date: 11/4/21
 * Revised: 11/10/21, 11/13/21 (Kris Barnes), 11/15/21 (Oliver Adams)
 */

   
public class BadGuy extends Character{

    private String[] phrase = {
            "Mwahahahaha!",
            "You've failed the synthesis!",
            "I've got you now!",
            "We meet again!",
            "Luke, I am your father."
    };

    //making a constructor that matches the super:
    public BadGuy(String name, double hp, double strength) {
        super(name, hp, strength);
    }

    public double attack() {
        System.out.println(this.getName() + ": " + this.phrase[(int)(Math.random() * (4 - 0) + 0)]);
        return (double)((Math.random() * 3 * (super.getStrength() - 1)) + 1);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
