package L3;

//Define the STUDENT class
class STUDENT {
 String sname;
 int[] marks_array;
 int total = 0;
 double avg;

 // Method to assign initial values
 void assign(String name, int[] marks) {
     sname = name;
     marks_array = marks;
 }

 // Method to compute total and average
 void compute() {
     for (int i = 0; i < marks_array.length; i++) {
         total += marks_array[i];
     }        
     avg = (double) total / marks_array.length;
 }

 // Method to display student details
 void display() {
     System.out.println("Student Name: " + sname);
     System.out.println("Marks: " + java.util.Arrays.toString(marks_array));
     System.out.println("Total Marks: " + total);
     System.out.println("Average Marks: " + avg);
 }
}

//Main class to test the STUDENT class
public class L3P1 {
 public static void main(String[] args) {
     // Create an object of STUDENT class
     STUDENT student1 = new STUDENT();
     
     // Assign values
     int[] marks = {85, 90, 78, 92, 88}; // Example marks
     student1.assign("John Doe", marks);
     
     // Compute total and average
     student1.compute();
     
     // Display student details
     student1.display();
 }
}
