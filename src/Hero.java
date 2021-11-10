/**
 * Group: Oliver Adams, Bailee Bartash, Kriston Barnes, Derek Muse
 * A hero has the ability to hold a weapon and mana
 *
 * Author: Bailee Bartash
 * Date: 11/4/21
 * Revised: 11/10/21
 */
public class Hero extends Character{
    private double mana;
    private Weapon weapon;

    //making a constructor that matches the super:
    public Hero(String name, double hp, double strength, double mana) {
        super(name, hp, strength);
        this.mana = mana;
    }

    // getters
    public double getMana() {
        return mana;
    }
    public Weapon getWeapon() {
        return weapon;
    }

    // setters
    public void setMana(double mana) {
        this.mana = mana;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // include the hero's mana in the character information
    @Override
    public String toString() {
        return super.toString() + "\nMana: " + mana;
    }

    /**
     * A hero's attack is based on their weapon. If the weapon has no more durability,
     * then the attack method calls the general character's attack. If the weapon is magic,
     * the loss of mana is greater
     * @param special indicates that the attack has been made with a weapon
     * @return the attack with a weapon
     */
    public double attack(boolean special) {
        if(this.weapon.getDurability() == 0){
            return this.attack();
        }
        if (weapon instanceof Magic) {
            if(special){
                mana-=2;
            } else {
                mana--;
            }
            if(mana == 0){
                return 0.0;
            }
        }
        return this.weapon.attack(special);
    }

}