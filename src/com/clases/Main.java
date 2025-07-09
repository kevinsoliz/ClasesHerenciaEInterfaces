package com.clases;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        // Ahora nuestro codigo está más limpio. Usamos constructores para inicializar los objetos.
        // si no lo inicializamos nosotros el compilador lo hará autómaticamente y establecerá los fields a los valores por defecto.
        // Ahora ya no necesitamos que los setters sean publicos porque solo los usaremos dentro de la clase Employee.


    }
}
