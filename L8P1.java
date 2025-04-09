package L8;

abstract class Figure {
    protected int x, y;
    public Figure(int x, int y) { this.x = x; this.y = y; }
    abstract void area();
}

class Rectangle extends Figure {
    public Rectangle(int x, int y) { super(x, y); }
    @Override void area() { System.out.println("Rectangle Area: " + (x * y)); }
}

class Triangle extends Figure {
    public Triangle(int x, int y) { super(x, y); }
    @Override void area() { System.out.println("Triangle Area: " + (0.5 * x * y)); }
}

class Square extends Figure {
    public Square(int x) { super(x, x); }
    @Override void area() { System.out.println("Square Area: " + (x * x)); }
}

public class L8P1 {
    public static void main(String[] args) {
        Figure f1 = new Rectangle(10, 20); f1.area();
        Figure f2 = new Triangle(10, 20); f2.area();
        Figure f3 = new Square(10); f3.area();
    }
}
