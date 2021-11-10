/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * Abstract Weapon Class to reduce the reuse of code in each of the 
 * three Weapon child classes.
 */

public abstract class Weapon {
		
	//fields
	private String name;
    private double strength;
    private int durability;

    /**
     * Constructor for a Weapon object
     * @param name is the Weapon's name
     * @param strength is the Weapon's strength between 0.0 and 25.0
     * @param durability is the Weapon's durability between 0 and 10
     */
    public Weapon(String name, double strength, int durability){
        this.name = name;
        this.strength = strength;
        this.durability = durability;
    }

   /**
    * Sets a Weapon's durability
    * @param durability is the Weapon's new durability
    */
   public void setDurability(int durability)
   {
	   this.durability = durability;
   }
   
   /**
    * Gets a Weapon's durability
    * @return the weapon's durability
    */
   public int getDurability()
   {
	   return this.durability;
   }
   
   
    
    

   @Override
   /**
    * toString Override 
    * @return the Weapon's characteristics in String format
    */
    public String toString(){
        return String.format("[Weapon Name: %s, Strength: %d, Durability: %d]", this.name, this.strength, this.durability);
    }
}