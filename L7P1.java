package L7;

class STUDENT {
    protected String name; protected int rollNo, marks1, marks2, marks3;
    public STUDENT(String n, int r, int m1, int m2, int m3) {
        name = n; rollNo = r; marks1 = m1; marks2 = m2; marks3 = m3;
    }
    public void compute() { System.out.println("Total: " + (marks1 + marks2 + marks3)); }
    public void display() { System.out.println(name + " (" + rollNo + ")"); }
}

class ScienceStudent extends STUDENT {
    private int practicalMarks;
    public ScienceStudent(String n, int r, int m1, int m2, int m3, int pm) {
        super(n, r, m1, m2, m3); practicalMarks = pm;
    }
    @Override public void compute() { System.out.println("Total: " + (marks1 + marks2 + marks3 + practicalMarks)); }
}

class ArtsStudent extends STUDENT {
    private String elective;
    public ArtsStudent(String n, int r, int m1, int m2, int m3, String e) {
        super(n, r, m1, m2, m3); elective = e;
    }
    public void display() { super.display(); System.out.println("Elective: " + elective); }
}

public class L7P1 {
    public static void main(String[] args) {
        STUDENT s1 = new STUDENT("John", 101, 85, 90, 78); s1.display(); s1.compute();
        ScienceStudent s2 = new ScienceStudent("Alice", 102, 88, 76, 90, 40); s2.display(); s2.compute();
        ArtsStudent s3 = new ArtsStudent("Bob", 103, 75, 80, 85, "History"); s3.display(); s3.compute();
    }
}
