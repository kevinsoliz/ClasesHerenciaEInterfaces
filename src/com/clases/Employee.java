package com.clases;

public class Employee {
    public int baseSalary;
    public int hourlyRate;
    public int extraHours;

    public int calculateWage(){ // Ya no hace falta tener parametros porque las variables que necesitamos están dentro de la clase.
        return baseSalary + (hourlyRate * extraHours);
    }
}
