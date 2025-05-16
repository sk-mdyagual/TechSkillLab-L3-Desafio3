package org.example.calculator.refactored;

public class ImpExtra implements ImpEstrategia {
    private static final double EXTRA_RATE = 0.05;

    @Override
    public double calcular(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount * EXTRA_RATE;
    }
}
