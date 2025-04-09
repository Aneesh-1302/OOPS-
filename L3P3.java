package L3;

import java.util.*;

class L3P3 {
    private int arr[]; // Array to store elements

    // Constructor to initialize the array
    public L3P3(int size) {
        arr = new int[size];
    }

    // Method to accept elements in ascending order without duplicates
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " sorted unique elements:");
        
        arr[0] = sc.nextInt();
        for (int i = 1; i < arr.length; i++) {
            int num = sc.nextInt();
            if (num > arr[i - 1]) {
                arr[i] = num;
            } else {
                System.out.println("Error: Enter numbers in strictly ascending order.");
                i--; // Retry input
            }
        }
    }

    // Method to merge two sorted arrays into a new sorted array
    public L3P3 mix(L3P3 A) {
        int mergedSize = this.arr.length + A.arr.length;
        L3P3 result = new L3P3(mergedSize);
        int i = 0, j = 0, k = 0;

        while (i < this.arr.length && j < A.arr.length) {
            result.arr[k++] = (this.arr[i] < A.arr[j]) ? this.arr[i++] : A.arr[j++];
        }
        
        // Copy remaining elements from the first array
        while (i < this.arr.length) {
            result.arr[k++] = this.arr[i++];
        }

        // Copy remaining elements from the second array
        while (j < A.arr.length) {
            result.arr[k++] = A.arr[j++];
        }

        return result;
    }

    // Method to display array elements
    public void display() {
        System.out.println("Array Elements: " + Arrays.toString(arr));
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of first array: ");
        L3P3 obj1 = new L3P3(sc.nextInt());
        obj1.accept();
        
        System.out.print("Enter the size of second array: ");
        L3P3 obj2 = new L3P3(sc.nextInt());
        obj2.accept();
        
        L3P3 mergedArray = obj1.mix(obj2);
        System.out.println("Merged Sorted Array:");
        mergedArray.display();
    }
}
