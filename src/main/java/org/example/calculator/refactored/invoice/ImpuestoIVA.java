package org.example.calculator.refactored.invoice;

public class ImpuestoIVA implements ImpEstrategia {

    private static final double IVA_RATE = 0.19;

    @Override
    public double calcularImpuesto(double amount) {
        return amount * IVA_RATE;
    }

}
