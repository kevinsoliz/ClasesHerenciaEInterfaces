package com.Interfaces;

public class Dragger {
    public void drag(UIWidget widget){
        widget.drag(); //El problema aquí es que esta clase está emparejada a la interfaz y aunque parezca que no pasa nada,
                        // sí que pasa! aunque esta clase solo use un metodo de la interfaz, si modificamos cualquier otro método
                        // que no tenga nada que ver estás jodido, vas a tener que recompilar igualemente esta clase. El comentario continua
                        // en la interfaz.
        System.out.println("Dragging done");
    }
}
