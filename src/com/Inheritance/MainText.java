package com.Inheritance;

import com.clases.TextBox;

public class MainText {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var text = new TextBox(true);
        show(control);
    }
    public static void show (Object control) {
        var text = (TextBox) control; //Importante: todos los textBoxs son UIControl pero no todos los UIControl son textBox
                                        //POr eso tenemos un error de compilación: ClassCastException.
        text.setText("Hello World");
        System.out.println(control);

    }
}
