package L8;

class Student {
    protected int rollNum;
    protected int[] marks = new int[3];
    public void getRollNum(int roll) { rollNum = roll; }
    public void putRollNum() { System.out.println("Roll No: " + rollNum); }
    public void getMarks(int m1, int m2, int m3) { marks[0] = m1; marks[1] = m2; marks[2] = m3; }
    public void putMarks() { System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]); }
}

interface Sports {
    void putSportsScore(int score);
}

class Result extends Student implements Sports {
    private int sportsScore;
    @Override public void putSportsScore(int score) { sportsScore = score; }
    public void displayResult() {
        putRollNum();
        putMarks();
        System.out.println("Sports Score: " + sportsScore);
        int total = marks[0] + marks[1] + marks[2] + sportsScore;
        System.out.println("Total Score: " + total);
    }
}

public class L8P3 {
    public static void main(String[] args) {
        Result student = new Result();
        student.getRollNum(101);
        student.getMarks(85, 90, 88);
        student.putSportsScore(15);
        student.displayResult();
    }
}
