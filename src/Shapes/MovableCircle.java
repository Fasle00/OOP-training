package Shapes;

public class MovableCircle extends MovablePoint implements Movable, GeometricObject{
    private int radius;

    public MovableCircle(int x, int y, int speedX, int speedY, int radius) {
        super(x, y, speedX, speedY);
        this.radius = radius;
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
        return "MovableCircle{" + super.toString() + ", radius=" + radius + '}';
    }

    @Override
    public void setSpeedX(int speed) {
        speedX = speed;
    }

    @Override
    public int getSpeedX() {
        return speedX;
    }

    @Override
    public void setSpeedY(int speed) {
        speedY = speed;
    }

    @Override
    public int getSpeedY() {
        return speedY;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }
}
