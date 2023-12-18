package Shapes;

public class TestPoint {
    public static void main(String[] args) {
        PolyLine p = new PolyLine();
        p.appendPoint(0,0);
        p.appendPoint(3,4);
        p.appendPoint(0,8);
        System.out.println(p.getTotalLength());
    }
}
