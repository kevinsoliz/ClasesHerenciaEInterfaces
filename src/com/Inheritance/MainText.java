package com.Inheritance;

import com.clases.TextBox;

public class MainText {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var text = new TextBox(true);
        text.setText("Hello World");
        show(text); //el método funciona con text porque este es hijo de UIControl
                    //La herencia representa una "is a" relationship, text es un UIControl
    }
    public static void show (Object control) {
        System.out.println(control);

    }
}
