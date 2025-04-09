package L2;

import java.util.Scanner;

public class L2P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalConsumption = 0;

        // Input daily consumption for 7 days
        System.out.println("Enter the daily consumption in units for 7 days:");
        for (int i = 0; i < 7; i++) {
            int dailyConsumption = scanner.nextInt();
            totalConsumption += dailyConsumption;
        }

        double totalBill = 0.0;

        switch (totalConsumption) {
            case 0:
                totalBill = 0;
                break;
            default:
                if (totalConsumption <= 100) {
                    totalBill = totalConsumption * 7.00;
                } else if (totalConsumption <= 200) {
                    totalBill = (100 * 7.00) + ((totalConsumption - 100) * 8.00);
                } else {
                    totalBill = (100 * 7.00) + (100 * 8.00) + ((totalConsumption - 200) * 10.00);
                }
                break;
        }

        System.out.println("Total electricity bill: INR " + totalBill);
    }
}
