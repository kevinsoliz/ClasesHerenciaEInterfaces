package com.Inheritance;

public class MainPoint {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1 == point2);// false porque comparas la referencia en memoria.
    }
}
