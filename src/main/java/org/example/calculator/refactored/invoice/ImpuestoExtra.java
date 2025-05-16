package org.example.calculator.refactored.invoice;

public class ImpuestoExtra implements ImpEstrategia {
    private static final double EXTRA_RATE = 0.05; // 5% extra tax

    @Override
    public double calcularImpuesto(double amount) {
        return amount * EXTRA_RATE;
    }
}
