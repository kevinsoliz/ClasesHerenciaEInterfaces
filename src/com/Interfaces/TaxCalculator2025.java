package com.Interfaces;

public class TaxCalculator2025 extends AbstractClassCalculator {
    private double taxableIncome;

    public TaxCalculator2025(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override // Es importante añadir la annotation
    public double calculateTax() {
        getTaxableIncome(taxableIncome, taxMax); // y ahi tienes tu metodo heredado desde la clase abstracta.
        return taxableIncome * 0.3;
    }
}
