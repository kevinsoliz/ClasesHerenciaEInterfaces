package com.Inheritance;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) { //El problema es que se podrá meter cualquier tipo de objeto y dará una ClasCastException
                                        //Incluso se podría meter el mismo objeto.
        if (this == obj)
            return true;
        if (!(obj instanceof Point))
            return false;
        var other = (Point) obj;
        return x == other.x && y == other.y;
    }
    //Genera un entero para indexar objetos Si a.equals(b) es true, entonces a.hashCode() == b.hashCode()
    //Cuando usas clases como HashMap o HashSet, Java:
    //Usa hashCode() para saber en qué "casilla" del hash ubicar el objeto.
    //Luego usa equals() para verificar si realmente es el mismo objeto.

    //hashCode y equals van siempre juntos.

    @Override
    public int hashCode() {
        return Objects.hash(x, y); //ya lo tendrias.
    }
}
