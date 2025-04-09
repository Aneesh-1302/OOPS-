package L2;

import java.util.Scanner;

public class L2P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 9-digit registration number:");
        String regNumber = in.nextLine();

        if (regNumber.length() != 9) {
            System.out.println("Invalid registration number. Please enter a 9-digit number.");
            return;
        }

        String yearOfJoining = regNumber.substring(0, 2);

        System.out.println("Year of joining: 20" + yearOfJoining);
    }
}
