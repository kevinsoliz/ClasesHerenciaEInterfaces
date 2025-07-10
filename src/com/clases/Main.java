package com.clases;


public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(0);
        System.out.println(wage);
        Employee employee1 = new Employee(23_000); //comando + p para ver la sobrecarga.


    }
}
