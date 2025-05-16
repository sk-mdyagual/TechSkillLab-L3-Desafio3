package org.example.calculator.refactored;

public class RecargoInvoiceStrategy implements InvoiceStrategy {
    @Override
    public double apply(double amount) {
        return amount * 1.05;
    }
}