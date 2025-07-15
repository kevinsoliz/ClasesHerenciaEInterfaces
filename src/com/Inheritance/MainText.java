package com.Inheritance;

import com.clases.TextBox;

public class MainText {
    public static void main(String[] args) {
        TextBox textBox = new TextBox(true);
        textBox.setText("Hello World");
        System.out.println(textBox); //no hace falta poner .toString!!!!!!!!!!!! joder! el compilador ya sabe lo que tiene que hacer!

    }
}
