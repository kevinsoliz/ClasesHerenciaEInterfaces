package com.clases;

public class TextBox {
    public String text = ""; //por defecto si no inicializas esta variable estará establecida a null.
                        //Los nulls son peligrosos y pueden crash our programs

    public void setText(String text) { // In situations where the name of the parameter is the same as the field we use this. keyword
        this.text = text;
    }

    public void clear() { // It's not necessary here
        text = "";
    }
}
