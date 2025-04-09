package L3;

import java.util.Scanner;

// Define the EMPLOYEE class
class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    // Method to read employee details
    void read(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        Eid = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        Basic = sc.nextDouble();
    }

    // Method to compute net salary
    void compute_net_sal() {
        DA = 0.52 * Basic;  // DA is 52% of Basic
        Gross_Sal = Basic + DA;  // Gross Salary = Basic + DA
        double IT = 0.30 * Gross_Sal;  // Income Tax (IT) = 30% of Gross Salary
        Net_Sal = Gross_Sal - IT;  // Net Salary = Gross Salary - IT
    }

    // Method to display employee details
    void display() {
        System.out.println("\nEmployee ID: " + Eid);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA (52% of Basic): " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary (After 30% IT): " + Net_Sal);
    }
}

// Main class to test the EMPLOYEE class
public class L3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int N = sc.nextInt();
        EMPLOYEE[] employees = new EMPLOYEE[N]; // Array to store employees

        // Read and compute details for N employees
        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            employees[i] = new EMPLOYEE(); // Create an employee object
            employees[i].read(sc);
            employees[i].compute_net_sal();
        }

        // Display details of all employees
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < N; i++) {
            employees[i].display();
        }

        sc.close(); // Close scanner
    }
}
