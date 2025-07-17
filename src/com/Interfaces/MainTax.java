package com.Interfaces;

public class MainTax {
    public static void main(String[] args) {
        //Constructor Injection: otra clase (MainTax) se encargará de pasar el objeto a la TaxReport
        //para que en el futuro solo tengamos que modificar esta (MainTax).
        //Aunque modifiquemos la TaxCalculator2025  y está tenga que ser recompilada, la TaxReport no tiene dependencia alguna con esta y
        // no habrá problemas.
        var calculator = new TaxCalculator2025(100_000);
        var taxReport = new TaxReport(calculator);
        taxReport.show();

        //Setter injection: a lo largo de la vida de nuestro programa quizás necesites cambiar la dependencia:
        taxReport.setCalculator(new TaxCalculator2026());
        taxReport.show();
        //Ahora la Constructor Injection es la más común.
    }
}
