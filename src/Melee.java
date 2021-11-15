/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * Melee Class to create a Melee Weapon for a Hero object
 * Author: Derek Muse
 */

import java.util.Random;


public class Melee extends Weapon{
	private String name;
    private double strength;
    private int durability;

    public Melee(String name, double strength, int durability){
        super(name, strength, durability);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
    
    
    /**
     * Attack method for Melee that has a high strength based attack
     * but takes a high durability cost (-2 to durability)
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
    	
    	//In the special case, the Melee Weapon uses twice its strength
    	//and loses all durability
    	if(special)
    	{
    		this.setDurability(0);
    		return this.strength*2;
    	}
    	else
    	{
    		this.setDurability(this.durability-2);
    		Random r1 = new Random();
    		return r1.nextDouble()*this.strength*1.5; 
    	}
    	
    }
}
