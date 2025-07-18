package com.Interfaces;

public interface UIWidget extends Draggable, Resizable, renderable {
    // Ahora lo más probable es que vayamos a necesitar que esta interfaz lleve todos estos métodos juntos, para eso usamos
    // la herencia.

    // puedes extract interface desde el menu refacto y automaticamente te crea la interfaz y te añade la herencia.

    //por cierto: en java las clases NO pueden tener multiple parents pero las interfaces sí.

}

