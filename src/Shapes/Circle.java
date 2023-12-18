package Shapes;

public class Circle extends Shape implements GeometricObject{
    protected int radius = 1;
    protected Point center;

    public Circle() {
        super();
        center = new Point();
    }
    public Circle(int radius) {
        super();
        this.radius = radius;
        center = new Point();
    }

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
        center = new Point();
    }

    public Circle(int x, int y, int radius) {
        super();
        this.radius = radius;
        center = new Point(x,y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() + ", radius=" + radius + '}';
    }
}
