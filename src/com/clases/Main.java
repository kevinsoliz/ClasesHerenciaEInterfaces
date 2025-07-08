package com.clases;


public class Main {
    public static void main(String[] args) {
        //TextBox textBox = new TextBox(); // Hay otra manera de instanciar un clase creada, tienes que usar var
        //Con var puedes declarar una variable y darle valores diferentes.

        var textBox = new TextBox(); //funciona! Usando var, puedes crear un código más limpio y que el compilador de java determine su tipo.
        textBox.setText("Hello World");
        System.out.println(textBox.text.toUpperCase());

        var textBox2 = new TextBox();
        textBox2.setText("Hello World");
        System.out.println(textBox2.text);
        int n = 1;
        String[] parImpar = {"Par", "Impar"};
        System.out.println(parImpar[n % 2]);
    }
}
