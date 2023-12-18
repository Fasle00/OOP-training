package Shapes;

public class Rect extends Shape implements GeometricObject{
    private float width;
    private float height;

    public Rect() {
        super();
        width = 1f;
        height = 1f;
    }

    public Rect(float width, float height) {
        super();
        this.width = width;
        this.height = height;
    }

    public Rect(String color, boolean filled, float width, float height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getLength() {
        return height;
    }
    public void setLength(float height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rect{" +
                super.toString() +
                ", width=" + width +
                ", length=" + height +
                '}';
    }
}
