package com.clases;

public class Employee {
    private int baseSalary; // Para controlar las validaciones debemos cambiar el modificador de acceso a private.
    private int hourlyRate;
    public static int numberOfEmployees; // es un miembro de clase, el resto son miembros de instancia, se instancian desde
                                            // el objeto creado.

    public Employee(int baseSalary) {
        this(baseSalary, 0);   //Y así es como sobrecargas un constructor.
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary); // si hicieras: this.baseSalay = baseSalary se podrian introducir valores inválidos.
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public static void getNumberOfEmployees() { // método de clase
        System.out.println("Number of employees: " + numberOfEmployees);
    }

    public int calculateWage(int extraHours){ // Digamos que las horas extra es la única variable que no es fija
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
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
