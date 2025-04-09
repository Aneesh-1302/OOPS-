package L4;

class L4P2 {
    private String name;
    private int id;
    private double salary;

    // Default constructor
    public L4P2() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public L4P2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("L4P2 Name: " + name);
        System.out.println("L4P2 ID: " + id);
        System.out.println("L4P2 Salary: " + salary);
    }

    public static void main(String[] args) {
        // Using default constructor
        L4P2 e1 = new L4P2();
        e1.display();
        
        // Using parameterized constructor
        L4P2 e2 = new L4P2("John", 101, 50000);
        e2.display();
    }
}
