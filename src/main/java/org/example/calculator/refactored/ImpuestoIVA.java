package org.example.calculator.refactored;

public class ImpuestoIVA implements ImpEstrategia{
    private static final double IVA_RATE = 0.19;

    @Override
    public double calcular(double amount){
        return amount * IVA_RATE;
    }
}
