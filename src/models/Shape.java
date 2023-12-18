package models;

import java.util.ArrayList;

public class Shape {
    // container for all points
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        return 0;
    }

    public double getDistance(Point dest) {
        return 0;
    }
    public double getLongest() {
        return 0;
    }
}
