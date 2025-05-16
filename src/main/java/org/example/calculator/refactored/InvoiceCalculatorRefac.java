package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {
    private final InvoiceStrategy strategy;

    public InvoiceCalculatorRefac(InvoiceStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount) {
        return strategy.apply(amount);
    }


}
