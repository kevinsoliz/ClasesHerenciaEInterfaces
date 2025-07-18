package com.Interfaces;

public class Dragger {
    public void drag(UIWidget draggable) {
        draggable.drag(); // puesto que hereda ahora puedes usar un UIWidget object tranquilamente.
        System.out.println("Dragging done");
    }
}
