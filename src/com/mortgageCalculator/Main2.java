package com.mortgageCalculator;

public class Main2 {
    public static void main(String[] args) {
        int principal = (int) Read.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Read.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Read.readNumber("Period (Years): ", 1, 30);

        var mortgage = new Mortgage(principal, annualInterest, years);
        mortgage.printMortgage();
        mortgage.printPaymentSchedule();
    }
}
