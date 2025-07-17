package com.Interfaces;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
