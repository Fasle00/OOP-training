package Shapes;

public class Point {
    protected int x;
    protected int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + '}';
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point p2){
        return Math.sqrt(Math.pow(this.x - p2.x,2) + Math.pow(this.y - p2.y, 2));
    }

    public double distance(){
        return Math.sqrt( x * x + y * y);
    }
}
