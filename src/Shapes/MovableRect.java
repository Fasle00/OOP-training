package Shapes;

public class MovableRect implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRect(int x1, int y1, int x2, int y2, int speedX, int speedY) {
        this.topLeft = new MovablePoint(x1,y1,speedX,speedY);
        this.bottomRight = new MovablePoint(x2,y2,speedX,speedY);
    }

    @Override
    public String toString() {
        return "MovableRect{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void setSpeedX(int speed) {
        topLeft.setSpeedX(speed);
        bottomRight.setSpeedX(speed);
    }

    @Override
    public int getSpeedX() {
        return topLeft.speedX;
    }

    @Override
    public void setSpeedY(int speed) {
        topLeft.setSpeedY(speed);
        bottomRight.setSpeedY(speed);
    }

    @Override
    public int getSpeedY() {
        return topLeft.speedY;
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }
    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
}
