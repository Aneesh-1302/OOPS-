package L7;

class Building {
    protected int squareFootage, stories;
    public Building(int sqFt, int st) { squareFootage = sqFt; stories = st; }
    public void displayDetails() {
        System.out.println("Square Footage: " + squareFootage + ", Stories: " + stories);
    }
}

class House extends Building {
    private int bedrooms, baths;
    public House(int sqFt, int st, int br, int ba) {
        super(sqFt, st); bedrooms = br; baths = ba;
    }
    @Override public void displayDetails() {
        super.displayDetails();
        System.out.println("Bedrooms: " + bedrooms + ", Baths: " + baths);
    }
}

class School extends Building {
    private int classrooms; private String gradeLevel;
    public School(int sqFt, int st, int cls, String grade) {
        super(sqFt, st); classrooms = cls; gradeLevel = grade;
    }
    @Override public void displayDetails() {
        super.displayDetails();
        System.out.println("Classrooms: " + classrooms + ", Grade Level: " + gradeLevel);
    }
}

public class L7P3 {
    public static void main(String[] args) {
        Building b1 = new House(2000, 2, 3, 2); b1.displayDetails();
        Building b2 = new School(5000, 3, 20, "High School"); b2.displayDetails();
    }
}
