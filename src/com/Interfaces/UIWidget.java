package com.Interfaces;

public interface UIWidget {
    void resize();
    void render();
    // Interface segregation principle: debemos dividir esta interfaz en partes más pequeñas, interfaces que se encarguen de
    // una sola capacidad: drag por un lado, resize por otro, etc.

}

