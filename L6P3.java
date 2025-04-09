package L6;

import java.util.*;

class Student {
    private String name;
    private int id;

    // Parameterized Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to extract initials from the student's name
    public String extractInitials() {
        String[] words = name.split(" ");
        StringBuilder initials = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initials.toString();
    }

    // Method to remove all whitespace from the student's name
    public String removeWhitespace() {
        return name.replaceAll("\\s+", "");
    }

    // Getter for name (used in sorting and substring search)
    public String getName() {
        return name;
    }

    // Display Student Details
    public void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("----------------------");
    }
}

public class L6P3 {

    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getName().compareToIgnoreCase(students[j + 1].getName()) > 0) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        Student[] students = new Student[scanner.nextInt()];
        scanner.nextLine(); // Consume newline

        // Input & Object Creation in One Loop
        for (int i = 0; i < students.length; i++) {
            System.out.print("\nEnter ID and Name for Student " + (i + 1) + ": ");
            students[i] = new Student(scanner.nextInt(), scanner.nextLine().trim());
        }

        // Display All Students
        System.out.println("\nStudent Details:");
        for (Student s : students)
            s.displayStudent();

        // Demonstrate Methods
        System.out.println("\nExtracted Initials:");
        for (Student s : students)
            System.out.println(s.getName() + " → " + s.extractInitials());

        System.out.println("\nNames without Whitespace:");
        for (Student s : students)
            System.out.println(s.getName() + " → " + s.removeWhitespace());

        // Substring Search
        System.out.print("\nEnter substring to search: ");
        String sub = scanner.nextLine().toLowerCase();
        System.out.println("Students containing '" + sub + "':");
        for (Student s : students)
            if (s.getName().toLowerCase().contains(sub))
                System.out.println(s.getName());

        // Sorting & Displaying Sorted Names
        sortStudents(students);
        System.out.println("\nStudents sorted alphabetically:");
        for (Student s : students)
            System.out.println(s.getName());

        scanner.close();
    }

}