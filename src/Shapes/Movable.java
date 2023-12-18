package Shapes;

public interface Movable {
    void setSpeedX(int speed);

    int getSpeedX();

    void setSpeedY(int speed);

    int getSpeedY();
    void moveUp();
    void moveRight();
    void moveLeft();
    void moveDown();

}
