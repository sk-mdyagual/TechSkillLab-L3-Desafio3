package org.example.calculator.delivery;

public class DeliveryCalculator {

    private final IDeliveryTax deliveryTax;

    public DeliveryCalculator(IDeliveryTax deliveryTax) {
        if (deliveryTax == null) {
            throw new IllegalArgumentException("El cálculo de impuestos de envío no puede ser nulo");
        }
        this.deliveryTax = deliveryTax;
    }


    public double calculateDeliveryTax(double peso){
        if (peso <= 0) {
            return 0;
        }
        return deliveryTax.calculateDeliveryTax(peso);
    }

}
