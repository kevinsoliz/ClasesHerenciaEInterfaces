package com.Interfaces;

public class TaxReport {

    private TaxCalculator calculator;

//    public TaxReport(TaxCalculator calculator) { //Esto es lo que se conoce como Constructor Injection
//        this.calculator = calculator;
//    }

    public void show(TaxCalculator calculator) { // Esto es Method Injection, porque solo este método necesita la calculator.
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
//    public void setCalculator(TaxCalculator calculator) { //Es es Setter Injection
//        this.calculator = calculator;
//    }
}
