/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * Magic Class to create a Magic Weapon for a Hero object
 */

import java.util.Random;


public class Magic extends Weapon{
	private String name;
    private double strength;
    private int durability;

    public Magic(String name, double strength, int durability){
        super(name, strength, durability);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
    
    /**
     * Attack method for Magic that has a high strength based attack
     * and takes a low durability cost (-1 to durability)
     * A hero is unable to use Magic if their mana is 0.  This is demonstrated 
     * in the hero's attack method.
     * @param special is true when the special attack is to be used that
     * will use a higher percent of its strength 
     * @return the strength of the attack
     */
    public double attack(boolean special)
    {
    	if(this.durability == 0)
    	{
    		return 0;
    	}

    	if(special)
    	{
    		this.setDurability(this.durability-1);
    		Random r2 = new Random();
    		double r = r2.nextDouble();

    			return r*this.strength*2;
    	}
    	else
    	{
    		this.setDurability(this.durability-1);
    		Random r3 = new Random();
    		return r3.nextDouble()*this.strength; 
    	}
    }
}


