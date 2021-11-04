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
	    
	    public double attack(boolean special)
	    {
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
