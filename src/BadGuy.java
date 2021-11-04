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

    public double badGuyAttack() {
        System.out.println(this.phrase[(int)(Math.random() * (4 - 0) + 0)]);
        return (double)((Math.random() * (super.getStrength() - 1)) + 1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
