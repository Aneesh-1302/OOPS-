package L7;

class EMPLOYEE {
    protected String name; protected int empId;
    public EMPLOYEE(String n, int id) { name = n; empId = id; }
    public void calculateSalary() {}
    public void displayEmployeeDetails() { System.out.println(name + " (" + empId + ")"); }
}

class PartTimeEmp extends EMPLOYEE {
    private int hoursWorked;
    private static final double hourlyRate = 20.0;
    public PartTimeEmp(String n, int id, int hours) {
        super(n, id); hoursWorked = hours;
    }
    @Override public void calculateSalary() { System.out.println("Salary: " + (hoursWorked * hourlyRate)); }
    @Override public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Hours: " + hoursWorked + ", Rate: " + hourlyRate);
    }
}

class FullTimeEmp extends EMPLOYEE {
    private double bonus, deductions;
    public FullTimeEmp(String n, int id, double b, double d) {
        super(n, id); bonus = b; deductions = d;
    }
    @Override public void calculateSalary() { System.out.println("Salary: " + (50000 + bonus - deductions)); }
    @Override public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: " + bonus + ", Deductions: " + deductions);
    }
}

public class L7P2 {
    public static void main(String[] args) {
        EMPLOYEE e1 = new PartTimeEmp("John", 201, 25); e1.displayEmployeeDetails(); e1.calculateSalary();
        EMPLOYEE e2 = new FullTimeEmp("Alice", 202, 5000, 2000); e2.displayEmployeeDetails(); e2.calculateSalary();
    }
}
