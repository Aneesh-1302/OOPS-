package L6;

import java.util.Scanner;

class Employee {
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee(String name, double salary) {
        this.name = formatEmployeeName(name);
        this.salary = salary;
    }

    // Method to format the employee's name
    public static String formatEmployeeName(String name) {
        String[] words = name.toLowerCase().split(" ");
        String formattedName = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                formattedName += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
            }
        }
        return formattedName.trim();
    }

    // Method to generate an email address based on the employee's name
    public String generateEmail() {
        String[] parts = name.split(" ");
        return new StringBuffer()
                .append(parts[0].charAt(0))  // First letter of first name
                .append(parts.length > 1 ? parts[1] : "")  // Last name (if exists)
                .toString().toLowerCase() + "@example.com";
    }

    // Display Employee details
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Email: " + generateEmail());
        System.out.println("-----------------------------");
    }
}public class L6P2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee[] employees = new Employee[n];

        // Taking input for each employee
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            employees[i] = new Employee(name, salary);
        }

        // Displaying Employee details
        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.displayEmployee();
        }

        scanner.close();
    }
}

