package L4;

class L4P3 {
    private String name;
    private String accountNumber;
    private String accountType;
    private double balance;
    private static double interestRate = 4.5; // Static data member

    // Default constructor
    public L4P3() {
        this.name = "Unknown";
        this.accountNumber = "0000";
        this.accountType = "Savings";
        this.balance = 0.0;
    }

    // Parameterized constructor
    public L4P3(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // No minimum balance check
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    

    // Display account details
    public void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Static method to display interest rate
    public static void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        // Using default constructor
        L4P3 acc1 = new L4P3();
        acc1.display();

        // Using parameterized constructor
        L4P3 acc2 = new L4P3("Alice", "123456", "Savings", 5000);
        acc2.display();

        // Deposit and withdraw operations
        acc2.deposit(2000);
        acc2.withdraw(3000);
        acc2.display();

        // Display interest rate
        L4P3.displayInterestRate();
    }
}
