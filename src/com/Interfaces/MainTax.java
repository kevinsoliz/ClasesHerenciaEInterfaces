package com.Interfaces;

public class MainTax {
    public static void main(String[] args) {
        //Constructor Injection: otra clase (MainTax) se encargará de pasar el objeto a la TaxReport
        //para que en el futuro solo tengamos que modificar esta (MainTax).
        //Aunque modifiquemos la TaxCalculator2025  y está tenga que ser recompilada, la TaxReport no tiene dependencia alguna con esta y
        // no habrá problemas.
        var calculator = new TaxCalculator2025(100_000);
        var taxReport = new TaxReport(calculator);

        //La forma de esta injection se llama "Poor mans dependency injection"
        //Para un programa pequeño sí va bien pero cuando hay cientos de clases la cosa cambia.
        //En estos casos necesita a "Dependency injection Framework", estas frameworks se ocupan de hacer la ijection
        //Spring es una de ellas.
    }
}
