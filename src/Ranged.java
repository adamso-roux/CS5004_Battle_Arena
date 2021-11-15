/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * Ranged Class to create a Ranged Weapon for a Hero object
 */

import java.util.Random;


public class Ranged extends Weapon{
		private String name;
	    private double strength;
	    private int durability;

	    public Ranged(String name, double strength, int durability){
	        super(name, strength, durability);
	    }

	    @Override
	    public String toString(){
	        return super.toString();
	    }
	    
	    
	    /**
	     * Attack method for Ranged that has a normal strength based attack
	     * and takes a low durability cost (-1 to durability)
	     * @param special is true when the special attack is to be used that
	     * will randomly attack more or less forcefully than usual 
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
	    		Random r1 = new Random();
	    		double r = r1.nextDouble();
	    		if(r>0.5)
	    		{
	    			return r*this.strength*2;
	    		}
	    		else{
	    			return r*this.strength/2; 
	    		}
	    	}
	    	else
	    	{
	    		this.setDurability(this.durability-1);
	    		Random r1 = new Random();
	    		return r1.nextDouble()*this.strength; 
	    	}
	    	
	    }


}
