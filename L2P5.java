package L2;

import java.util.Scanner;

public class L2P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to find its factorial:");
        int number = in.nextInt();

        int result = factorial(number);

        System.out.println("Factorial of " + number + " is " + result);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
