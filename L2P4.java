package L2;

import java.util.Scanner;

public class L2P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int size = in.nextInt();

        int[][] matrix = new int[size][size];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("Non-diagonal elements:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j && i + j != size - 1) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                } else {
                    System.out.print("- "); // Just to visualize the matrix
                }
            }
            System.out.println();
        }

        System.out.println("Sum of non-diagonal elements: " + sum);
    }
}
