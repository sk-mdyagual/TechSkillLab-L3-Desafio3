package org.example.calculator.refactored;

public class ImpuestoRecargo implements ImpEstrategia {

    private static final double RECARGO_RATE = 0.10;

    @Override
    public double calcular(double amount) {
        return amount * RECARGO_RATE; // Recargo
    }
}
