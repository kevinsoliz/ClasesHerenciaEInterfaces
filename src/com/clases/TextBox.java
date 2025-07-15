package com.clases;

import com.Inheritance.UIControl;

public class TextBox extends UIControl {
    public String text = "";

    public TextBox(boolean isEnabled) {
        super(isEnabled); // el super qué es el constructor del padre, siempre debe inicializarse en la primera linea de codigo.
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() { // It's not necessary here
        text = "";
    }

    @Override //this is an annotation, le da información extra al compilador de Java.
    public String toString() {
        return text;
    }
}
