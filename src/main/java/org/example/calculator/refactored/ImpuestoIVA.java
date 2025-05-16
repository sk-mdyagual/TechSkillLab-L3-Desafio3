package org.example.calculator.refactored;

public class ImpuestoIVA implements ImplEstrategia{

    private static final double IVA_RATE = 15;

    @Override
    public double calcular(double amount) {
        return amount * IVA_RATE;
    }
}
