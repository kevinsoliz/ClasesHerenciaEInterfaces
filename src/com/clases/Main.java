package com.clases;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);//Hay un problema, qué pasa si introducimos numeros negativos? Hay que validar estas entradas.
        employee.hourlyRate = 50;
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
