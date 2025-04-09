package L1;

import java.util.Scanner;
import java.util.Arrays;

public class L1P4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = in.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Enter the number of steps to rotate:");
        int steps = in.nextInt();

        System.out.println("Enter the direction of rotation (left/right):");
        String direction = in.next();

        if (direction == "left") {
            steps = steps % size;
            for (int i = 0; i < steps; i++) {
                int first = array[0];
                for (int j = 0; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = first;
            }
        } else if (direction == "right") {
            steps = steps % size;
            for (int i = 0; i < steps; i++) {
                int last = array[size - 1];
                for (int j = size - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = last;
            }
        } else {
            System.out.println("Invalid direction. Please enter 'left' or 'right'.");
            return;
        }

        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}

