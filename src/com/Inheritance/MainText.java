package com.Inheritance;

import com.clases.TextBox;

public class MainText {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var text = new TextBox(true);
        text.setText("Hello World");
        show(text); //el método funciona con text porque este es hijo de UIControl
    }
    public static void show (UIControl control) {
        System.out.println(control);

    }
}
