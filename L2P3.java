package L2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class L2P3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Enter the date of birth (dd-MM-yyyy):");
        String dobInput = in.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dobInput, formatter);

        int serviceYears = 60; // Assuming the service period is 60 years

        LocalDate retirementDate = dateOfBirth.plusYears(serviceYears);

        System.out.println("Date of Retirement: " + retirementDate.format(formatter));
    }
}
