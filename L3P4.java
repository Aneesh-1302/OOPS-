package L3;

import java.util.Random;

class Die {
    private int sideUp;
    private Random rand; 

    public Die() {
        rand = new Random();
        roll(); 
    }

    public int getSideUp() {
        return sideUp;
    }

    public void roll() {
        sideUp = rand.nextInt(6) + 1;  
    }
}

public class L3P4 {
    public static void main(String[] args) {

        Die die1 = new Die();
        Die die2 = new Die();

        die1.roll();
        die2.roll();

        int sum = die1.getSideUp() + die2.getSideUp();
        System.out.println("Die 1: " + die1.getSideUp());
        System.out.println("Die 2: " + die2.getSideUp());
        System.out.println("Sum of both dice: " + sum);
    }
}
