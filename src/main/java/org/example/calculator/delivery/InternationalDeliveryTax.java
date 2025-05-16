package org.example.calculator.delivery;

public class InternationalDeliveryTax  implements IDeliveryTax {

    private static final double TAX_RATE_INTERNATIONAL = 3.0;

    @Override
    public double calculateDeliveryTax(double weight) {
        return weight * TAX_RATE_INTERNATIONAL;
    }
}
