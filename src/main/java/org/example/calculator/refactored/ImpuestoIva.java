package org.example.calculator.refactored;

public class ImpuestoIva implements ImpEstrategia {

    private static final double IVA_RATE = 0.16;

    @Override
    public double calcular(double amount) {
        return amount * IVA_RATE; // IVA
    }
}
