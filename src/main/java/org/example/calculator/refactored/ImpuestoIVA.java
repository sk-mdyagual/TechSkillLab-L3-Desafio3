package org.example.calculator.refactored;

public class ImpuestoIVA implements ImpEstrategia {
    @Override
    public double calcular(double amount) {
        return amount * 0.19; // IVA
    }
}
