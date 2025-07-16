package com.Inheritance;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj; // hay que hacer el downcasting si o si
        return x == p.x && y == p.y;
    }
}
