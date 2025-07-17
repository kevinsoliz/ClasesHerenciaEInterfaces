package com.Interfaces;

public class MainTax {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2025(100_000);
        //Method Injection:
        var taxReport = new TaxReport();
        taxReport.show(calculator);
        taxReport.show(new TaxCalculator2026());
        //Pasas la injection a la clase que necesita esa dependencia.

        //Todo genial pero aún hay dependencia peligrosa entre estas clases, estas dependen de la interfaz, y si la interfaz cambia
        //todos se fastidian, las interfaces siempre deben ser pequeñas y no susceptibles de ser modificadas

    }
}
