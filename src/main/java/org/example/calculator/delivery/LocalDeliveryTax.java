package org.example.calculator.delivery;

public class LocalDeliveryTax implements IDeliveryTax {

    private static final double TAX_RATE_LOCAL = 1.5;

    @Override
    public double calculateDeliveryTax(double weight) {
        return weight * TAX_RATE_LOCAL;
    }
}
