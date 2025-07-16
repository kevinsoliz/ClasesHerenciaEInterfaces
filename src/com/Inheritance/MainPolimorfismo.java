package com.Inheritance;

import com.clases.TextBox;

import java.awt.*;

public class MainPolimorfismo {
    public static void main(String[] args) {
        UIControl[] controls = {new TextBox(true), new CheckBox()};

        for(var control :controls)
            control.render();

    }
}
