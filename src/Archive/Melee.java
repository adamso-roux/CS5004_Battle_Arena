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
    
    
    public double attack(boolean special)
    {
    	if(special)
    	{
    		this.setDurability(0);
    		return this.strength;
    	}
    	else
    	{
    		this.setDurability(this.durability-2);
    		Random r1 = new Random();
    		return r1.nextDouble()*this.strength; 
    	}
    	
    }
}
