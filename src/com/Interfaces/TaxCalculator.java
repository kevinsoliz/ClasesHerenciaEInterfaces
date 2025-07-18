package com.Interfaces;

public interface TaxCalculator {
    float taxMax = 100; //Esto es una constante final y static, nunca debes poner constantes en tu interfaz, son
                        //detalles de implementación y recuerda que una interfaz dice qué hace las clases dicen cómo.
    double calculateTax(); // no hace falta poner modificadores de acceso, siempre va a ser público, una interfaz es un contrato público.
                            //Tampoco se puede instanciar.
    //otra de las bad features de Java: static methods

//    static double getTaxableIncome(double income, double expenses){
//        return income - expenses;
//    }
    // Muy mal, las interfaces nunca deben llevar lógica dentro y si necesitas un algoritmo que lo va a usar todas tus clases entonces
    // creas una clase abstracta que es heredada por todos los hijos.
}
