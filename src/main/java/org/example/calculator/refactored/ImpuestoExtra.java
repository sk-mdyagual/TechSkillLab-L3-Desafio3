package org.example.calculator.refactored;

public class ImpuestoExtra implements ImpEstrategia {

    @Override
    public double calcular(double amount) {
        // Recargo del 5%
        double recargo = 0.05;
        return amount * recargo; // Recargo
    }
}
