package org.example.calculator.refactored;


public class SinImpuestoInvoiceStrategy implements InvoiceStrategy {
    @Override
    public double apply(double amount) {
        return amount;
    }
}