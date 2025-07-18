package com.Interfaces;

public interface TaxCalculator {
    float taxMax = 100; //Esto es una constante final y static, nunca debes poner constantes en tu interfaz, son
                        //detalles de implementación y recuerda que una interfaz dice qué hace los métodos dicen cómo.
    double calculateTax(); // no hace falta poner modificadores de acceso, siempre va a ser público, una interfaz es un contrato público.
                            //Tampoco se puede instanciar.
}
