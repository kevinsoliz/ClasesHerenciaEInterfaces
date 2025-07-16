package com.Inheritance;

public class MainPoint {
    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);

        System.out.println(point1.equals(point2));// false porque este metodo no está sobreescrito, su comportamiento original es comparar las referencias.
    }
}
