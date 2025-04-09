package L1;

import java.util.Scanner;

public class L1P2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter second number:");
        int num2 = in.nextInt();

        // Adding two numbers using bitwise operators
        while (num2 != 0) {
            int carry = num1 & num2; // carry now contains common set bits of num1 and num2
            num1 = num1 ^ num2; // sum of bits of num1 and num2 where at least one of the bits is not set
            num2 = carry << 1; // carry is shifted by one so that adding it to num1 gives the required sum
        }

        System.out.println("Sum: " + num1);

        // Check if the sum is even or odd
        if ((num1 & 1) == 0) {
            System.out.println("The sum is an even number.");
        } else {
            System.out.println("The sum is an odd number.");
        }

        in.close();
    }
}

