package Shapes;

public class TestPoint {
    public static void main(String[] args) {
        PolyLine p = new PolyLine();
        p.appendPoint(0,0);
        p.appendPoint(3,4);
        p.appendPoint(0,8);
        System.out.println(p.getTotalLength());
        System.out.println(p);

        MovableCircle movableCircle = new MovableCircle(0,0,5,5,10);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveDown();
        movableCircle.moveRight();
        System.out.println(movableCircle);



    }
}
