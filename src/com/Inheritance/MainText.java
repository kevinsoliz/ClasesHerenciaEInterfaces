package com.Inheritance;

import com.clases.TextBox;

public class MainText {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var text = new TextBox(true);
        show(text);
    }
    public static void show (Object control) { //hay que asegurarase de que el objeto pasado aqui es una instancia de la clase TextBox.
        if (control instanceof TextBox) {
            var text = (TextBox) control;
            text.setText("Hello World");
        }
        System.out.println(control);

    }
}
