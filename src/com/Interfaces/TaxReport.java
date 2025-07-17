package com.Interfaces;

public class TaxReport {
    private TaxCalculator2025 calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator2025(100_000);
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
