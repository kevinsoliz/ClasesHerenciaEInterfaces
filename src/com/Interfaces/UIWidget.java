package com.Interfaces;

public interface UIWidget extends Draggable {
    void resize();
    void render();
    // Ahora lo más probable es que vayamos a necesitar que esta interfaz lleve todos estos métodos juntos, para eso usamos
    // la herencia.

}

