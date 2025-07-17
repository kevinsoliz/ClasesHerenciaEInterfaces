package com.Interfaces;

public class TaxCalculator2025 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2025(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override // Es importante añadir la annotation
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
