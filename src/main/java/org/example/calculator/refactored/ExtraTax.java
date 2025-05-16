package org.example.calculator.refactored;

public class ExtraTax implements ITaxes {
    private static final double TAX_RATE_EXTRA = 0.10;

    @Override
    public double calculateTax(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount * TAX_RATE_EXTRA;
    }
}
