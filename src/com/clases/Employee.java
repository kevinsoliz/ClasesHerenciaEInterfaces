package com.clases;

public class Employee {
    private int baseSalary; // Para controlar las validaciones debemos cambiar el modificador de acceso a private.
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary); // si hicieras: this.baseSalay = baseSalary se podrian introducir valores inválidos.
        setHourlyRate(hourlyRate);
    }
    public int calculateWage(int extraHours){ // Digamos que las horas extra es la única variable que no es fija
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public int calculateWage(){ // En python puedes poner un valor por defecto directamente en el parámetro.
        return calculateWage(0);
    }


    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getBaseSalary() { //Ahora mismo los getters son public, esto proporciona detalles innecesarios y el coupleling también aumenta.
                                // Para evitarlo los hacemos private, así reducimos el coupleling.
        return baseSalary;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary must be greater than 0");
        this.baseSalary = baseSalary;
    }
}
