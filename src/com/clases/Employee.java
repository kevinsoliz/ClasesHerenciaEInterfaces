package com.clases;

public class Employee {
    private int baseSalary; // Para controlar las validaciones debemos cambiar el modificador de acceso a private.
    private int hourlyRate;

    public int calculateWage(int extraHours){ // Digamos que las horas extra es la única variable que no es fija
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }


    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary must be greater than 0");
        this.baseSalary = baseSalary;
    }
}
