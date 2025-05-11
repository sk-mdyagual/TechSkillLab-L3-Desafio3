package org.example.calculator;

public class InvoiceCalculator {
    public double calculate(double amount, int type) {
        if (type == 1) {
            return amount * 1.19; // IVA
        } else if (type == 2) {
            return amount * 1.05; // Recargo
        } else {
            return amount;
        }
    }
}


