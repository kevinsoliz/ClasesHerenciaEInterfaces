package com.Interfaces;

public class Dragger {
    public void drag(Draggable draggable) {
        draggable.drag(); // ya no nos importa si el draggable es un UIWidget o lo que sea, solo nos interesa lo que hace
                        // ojo: solo tenemos un coupleling point porque el Draggable tiene solo un método pero si tuviera diez
                        //serian diez coupleling points.
        System.out.println("Dragging done");
    }
}
