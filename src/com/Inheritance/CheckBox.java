package com.Inheritance;

public final class CheckBox extends UIControl{

    @Override
    public void render() {
        System.out.println("Rendering CheckBox");
    }
}

//public class MyCheckbox extends CheckBox(); //No funciona porque está declarada como final, pasa lo mismo con los métodos
                                            //los que son final no se pueden sobreescribir
