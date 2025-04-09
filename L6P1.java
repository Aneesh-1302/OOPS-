package L6;

import java.util.Scanner;
import java.util.Arrays;

public class L6P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString;

        System.out.print("Enter a string: ");
        originalString = scanner.nextLine();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Sort the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string with its reverse");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (isPalindrome(originalString)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 2: System.out.println("Sorted string: " + sortString(originalString)); break;
                case 3:
                    System.out.println("Reversed string: " + reverseString(originalString));
                    break;
                case 4:
                    System.out.println("Concatenated string: " + originalString + reverseString(originalString));
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuffer reversed = new StringBuffer(str).reverse(); // Reverse the string
        return str.equalsIgnoreCase(reversed.toString()); // Compare (ignoring case)
    }
    

    public static String sortString(String str) {
        char[] charArray = str.toCharArray();
    Arrays.sort(charArray); // Using built-in sorting

    return new String(charArray); // Converting sorted character array back to a string

    }

    public static String reverseString(String str) {
        return new StringBuffer(str).reverse().toString();
    }
    
}
