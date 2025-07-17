package com.Interfaces;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) { //Esto es lo que se conoce como Constructor Injection
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
