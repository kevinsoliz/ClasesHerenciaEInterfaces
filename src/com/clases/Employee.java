package com.clases;

public class Employee {
    private int baseSalary; // Para controlar las validaciones debemos cambiar el modificador de acceso a private.
    public int hourlyRate;

    public int calculateWage(int extraHours){ // Digamos que las horas extra es la única variable que no es fija
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary){ // con esto ya tenemos controladas las validaciones.
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }
}
