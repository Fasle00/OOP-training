package Shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolyLine {
    private ArrayList<Point> points = new ArrayList<Point>();

    public PolyLine() {
    }

    public PolyLine(Point[] points) {
        Collections.addAll(this.points, points);
    }

    public void appendPoint(int x, int y){
        points.add(new Point(x,y));
    }

    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (Point point :
                points) {
            out.append(point.toString());
        }
        return out.toString();
    }

    public int getLineCount(){
        if (points.size() < 2) return 0;
        return points.size() - 1;
    }

    public double getTotalLength() {
        if (points.size() < 2) return 0;
        double tot = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            tot += points.get(i).distance(points.get(i+1));
        }
        return tot;
    }
}
