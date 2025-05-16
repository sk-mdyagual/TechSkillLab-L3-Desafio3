package org.example.calculator.refactored;

public class ImpuestoIVA implements ImpEstrategia{
    private static final double IVA_RATE = 0.15;

    @Override
    public double calcular(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount * IVA_RATE;
    }
}
