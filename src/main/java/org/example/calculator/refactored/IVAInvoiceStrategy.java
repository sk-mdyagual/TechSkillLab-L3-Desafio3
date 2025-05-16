package org.example.calculator.refactored;

public class IVAInvoiceStrategy implements InvoiceStrategy {
    @Override
    public double apply(double amount) {
        return amount * 1.19;
    }
}
