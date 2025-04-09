package L1;

public class L1P3 {
    public static void main(String[] args) {
        // Statement a
        int x = 10;
        
        // The following line would cause a compilation error because we cannot redeclare x with a different type in the same scope.
        // double x = 10.5; 

        // Corrected code for the subsequent statements
        double x2 = 10.5; // Using x2 to avoid the redeclaration error
        double y1 = x2;
        int y2 = (int) x2;
        
        System.out.println(y1); // This will print 10.5
        System.out.println(y2); // This will print 10 (casting double to int truncates the decimal part)
    }
}
