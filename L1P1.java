package L1;

import java.util.*;
public class L1P1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no of hours - ");
        int hWork = in.nextInt();
        System.out.print("Enter the hourly rate - ");
        double hRate = in.nextDouble();

        double salary;
        if (hWork <= 40)
            salary = hWork * hRate;
        else
            salary = (40 * hRate) + ((hWork - 40) * hRate * 1.5);

        System.out.println("Total salary - "+salary);

        in.close();
    }
}
