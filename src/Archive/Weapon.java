public abstract class Weapon {
		
	private String name;
    private double strength;
    private int durability;

    public Weapon(String name, double strength, int durability){
        this.name = name;
        this.strength = strength;
        this.durability = durability;
    }

   public String getName()
   {
	   return this.name;
   }
   public double getStrength()
   {
	   return this.strength;
   }
   public int getDurability()
   {
	   return this.durability;
   }
  
   public void setStrength(double strength)
   {
	   this.strength = strength;
   }
   public void setDurability(int durability)
   {
	   this.durability = durability;
   }
    
    
    @Override
    public String toString(){
        return String.format("[Weapon Name: %s, Strength: %d, Durability: %d]", this.name, this.strength, this.durability);
    }
}