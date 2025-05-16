package org.example.calculator.delivery;

public interface IDeliveryTax {
    /**
     * Calculates the delivery tax based on weight and zone.
     *
     * @param weight the weight of the package
     * @return the calculated delivery tax
     */
    double calculateDeliveryTax(double weight);

}
