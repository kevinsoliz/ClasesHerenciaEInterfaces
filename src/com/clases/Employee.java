package com.clases;

public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculateWage(int extraHours){ // Digamos que las horas extra es la única variable que no es fija
        return baseSalary + (hourlyRate * extraHours);
    }
}
