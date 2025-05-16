package org.example.calculator.refactored;

public class IvaTax implements ITaxes {

    private static final double TAX_RATE_IVA = 0.15;

    @Override
    public double calculateTax(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount * TAX_RATE_IVA;
    }
}
