package L1;

import java.util.Scanner;

public class L1P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of products:");
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        String[] productName = new String[n];
        double[] productPrice = new double[n];
        int[] productQuantity = new int[n];

        // Input stock information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of product " + (i + 1) + ":");
            productName[i] = in.nextLine();
            System.out.println("Enter the price of product " + (i + 1) + ":");
            productPrice[i] = in.nextDouble();
            System.out.println("Enter the quantity of product " + (i + 1) + ":");
            productQuantity[i] = in.nextInt();
            in.nextLine(); // Consume the newline character
        }

        double totalBill = 0.0;

        while (true) {
            System.out.println("Enter the product name you want to purchase (or 'done' to finish):");
            String purchaseProduct = in.nextLine();

            if (purchaseProduct.equalsIgnoreCase("done")) {
                break;
            }

            boolean productFound = false;
            for (int i = 0; i < n; i++) {
                if (productName[i].equalsIgnoreCase(purchaseProduct)) {
                    productFound = true;
                    System.out.println("Enter the quantity you want to purchase:");
                    int purchaseQuantity = in.nextInt();
                    in.nextLine(); // Consume the newline character

                    if (purchaseQuantity <= productQuantity[i]) {
                        productQuantity[i] -= purchaseQuantity;
                        double cost = purchaseQuantity * productPrice[i];
                        totalBill += cost;
                        System.out.println("Added to bill: " + purchaseQuantity + " x " + productName[i] + " @ " + productPrice[i] + " each. Cost: " + cost);
                    } else {
                        System.out.println("Sorry, we only have " + productQuantity[i] + " of " + productName[i]);
                    }
                    break;
                }
            }

            if (!productFound) {
                System.out.println("Product not found. Please enter a valid product name.");
            }
        }

        System.out.println("Total bill: " + totalBill);
        in.close();
    }
}
