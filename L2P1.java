package L2;

import java.util.Scanner;

public class L2P1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the total distance traveled (in km):");
        int distance = in.nextInt();
        int totalFare = 0;

        if (distance <= 5) {
            totalFare = distance * 10;
        } else if (distance <= 20) {
            totalFare = (5 * 10) + ((distance - 5) * 8);
        } else if (distance <= 45) {
            totalFare = (5 * 10) + (15 * 8) + ((distance - 20) * 5);
        } else {
            totalFare = (5 * 10) + (15 * 8) + (25 * 5) + ((distance - 45) * 5);
        }

        System.out.println("Total Fare: \u20b9" + totalFare);
    }
}

