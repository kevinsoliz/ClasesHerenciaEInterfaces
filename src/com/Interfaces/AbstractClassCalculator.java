package com.Interfaces;

public abstract class AbstractClassCalculator implements TaxCalculator{
    // para empezar no queremos que sea static, solo los métodos reales deberian usar este:
    // en este caso deberiamos usar el protected, para que todos los hijos dentro del mismo paquete puedan usarlo.
    protected double getTaxableIncome(double income, double expenses){
      return income - expenses;
   }
}
