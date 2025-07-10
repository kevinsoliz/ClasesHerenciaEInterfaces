package com.clases;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(0); //No puedes sobrecargar un método demasiado, en este caso no haría falta
                                                        // porque el cambio de parámetros es sutil,
                                                        // Debes hacer sobrecarga cuando los poarámetros son realmente diferentes
                                                        // cuando pasas de enteros a los de referencia.
        System.out.println(wage);


    }
}
