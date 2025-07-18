package com.Interfaces;

public interface Resizable {
    //Todos los métodos deben estar relacionados con la misma capacidad:
    void resize();
    //por ejemplo:
    void resize(int width, int height);
    void resizeTo(UIWidget widget);
}
