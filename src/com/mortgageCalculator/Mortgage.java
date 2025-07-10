package com.mortgageCalculator;

import java.text.NumberFormat;

public class Mortgage {
    private final byte MONTHS_IN_YEAR = 12;
    private final byte PERCENT = 100;

    private int principal;
    private byte years;

    private float monthlyInterest;
    private float numberOfPayments;

    public Mortgage(int principal, float annualInterest, byte years) {
        this.principal = principal;
        this.years = years;

        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        numberOfPayments = years * MONTHS_IN_YEAR;
    }


    private double calculateMortgage(){

        return principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }


    private double calculateBalance(short numberOfPaymentsMade){

        return principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }


    public void printMortgage() {
        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
