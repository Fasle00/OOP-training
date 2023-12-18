package Shapes;

public class MovablePoint extends Point implements Movable{
    protected int speedX;
    protected int speedY;

    public MovablePoint(int x, int y) {
        super(x,y);
        this.speedX = 0;
        this.speedY = 0;
    }
    public MovablePoint(int x, int y, int speedX, int speedY) {
        super(x,y);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + super.toString() + ", speedX=" + speedX + ", speedY=" + speedY + "}";
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
        y -= speedY;
    }

    @Override
    public void moveDown() {
        y += speedY;
    }

    @Override
    public void moveLeft() {
        x -= speedX;
    }

    @Override
    public void moveRight() {
        x += speedX;
    }
}
