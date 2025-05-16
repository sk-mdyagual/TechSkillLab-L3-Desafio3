package org.example.calculator.refactored;

public class ImpuestoSolidario implements ImpEstrategia{
    private static final double IMPUESTO_SOLIDARIO = 0.05;

    @Override
    public double calcular(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount * IMPUESTO_SOLIDARIO;
    }
}
