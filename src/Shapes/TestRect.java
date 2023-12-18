package Shapes;

public class TestRect {
    public static void main(String[] args) {
        // Test constructors and toString()
        // You need to append a 'f' or 'F' to a float literal
        MovableRect r1 = new MovableRect(0,0,20,20,5,5);
        System.out.println(r1);  // toString()
        r1.moveRight();
        r1.moveRight();
        r1.moveDown();
        System.out.println(r1);

    }
}