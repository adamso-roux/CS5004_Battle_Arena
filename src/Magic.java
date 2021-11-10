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

    public double attack(boolean special)
    {
        if(this.durability <= 0)
        {
            return 0;
        }

        Random r1 = new Random();
        int dur = r1.nextInt(2);
        if(dur == 1)
        {
            this.setDurability(this.durability-1);
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