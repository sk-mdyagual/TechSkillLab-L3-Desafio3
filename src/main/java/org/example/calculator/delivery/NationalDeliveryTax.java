package org.example.calculator.delivery;

public class NationalDeliveryTax implements IDeliveryTax {
    private static final double TAX_RATE_NATIONAL = 2.0;

    @Override
    public double calculateDeliveryTax(double weight) {
        return weight * TAX_RATE_NATIONAL;
    }
}
