package L4;

class L4P1 {
    private String name;
    private int age;

    // Default constructor
    public L4P1() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public L4P1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("L4P1 Name: " + name);
        System.out.println("L4P1 Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        L4P1 s1 = new L4P1();
        s1.display();
        
        // Using parameterized constructor
        L4P1 s2 = new L4P1("Alice", 21);
        s2.display();
    }
}
