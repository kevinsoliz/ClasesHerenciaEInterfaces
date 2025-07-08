package com.clases;


public class Main {
    public static void main(String[] args) {
        //TextBox textBox = new TextBox(); // Hay otra manera de instanciar un clase creada, tienes que usar var
        //Con var puedes declarar una variable y darle valores diferentes.

        var textBox = new TextBox(); //funciona! Usando var, puedes crear un código más limpio y que el compilador de java determine su tipo.
        //textBox.setText("Hello World");
        System.out.println(textBox.text.toUpperCase());
        // lo que estamos intentando hacer es usar este método con un objeto que no referencia a un objeto real.
        // por eso nos salta el nullPointerException
        //Para evitar esta excepción tienes que inicializar tus varibles a vacio o cero, etc.
    }
}
