package com.clases;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
        //Todo ese codigo es una mala implementación porque no queremos obligar a los clientes de nuestras clases a que las usen
        // de una determinada manera. Es como si tu mando te obligase a pulsar a y luego b para poder cambiar de canal.
        // Queremos que la interfaz de esta clase sea lo más simple posible, para ahorrarnos el trabajo de adivinar a ver cómo funciona.
        // NECESITAMOS UN CONSTRUCTOR! Java automaticamente crea el método constructor. Y establecera los valores de los fields de los
        //primitive types a 0, los booleans a false y los de referencia a null.

    }
}
