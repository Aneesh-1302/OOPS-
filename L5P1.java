package L5;

class L5P1 {
    private String name;
    private int rollNumber;
    private Subject[] subjects;
    private int subjectCount;
    private static final int MAX_SUBJECTS = 10;

    public L5P1(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new Subject[MAX_SUBJECTS];
        this.subjectCount = 0;
    }

    // Inner class Subject
    class Subject {
        private String subjectName;
        private int marks;

        public Subject(String subjectName, int marks) {
            this.subjectName = subjectName;
            this.marks = marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        public void displaySubjectDetails() {
            System.out.println("Subject: " + subjectName + ", Marks: " + marks);
        }
    }

    // Method to add a subject
    public void addSubject(String subjectName, int marks) {
        if (subjectCount < MAX_SUBJECTS) {
            subjects[subjectCount++] = new Subject(subjectName, marks);
        } else {
            System.out.println("Cannot add more subjects.");
        }
    }

    // Calculate total marks
    public int getTotalMarks() {
        int total = 0;
        for (int i = 0; i < subjectCount; i++) {
            total += subjects[i].marks;
        }
        return total;
    }

    // Calculate average marks
    public double getAverageMarks() {
        if (subjectCount == 0) return 0;
        return (double) getTotalMarks() / subjectCount;
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subjects:");
        for (int i = 0; i < subjectCount; i++) {
            subjects[i].displaySubjectDetails();
        }
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }

    public static void main(String[] args) {
        L5P1 student = new L5P1("Jaideep", 101);
        student.addSubject("Math", 85);
        student.addSubject("Science", 90);
        student.addSubject("History", 78);
        
        student.displayStudentDetails();
    }
}
