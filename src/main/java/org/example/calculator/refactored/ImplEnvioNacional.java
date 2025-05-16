package org.example.calculator.refactored;

public class ImplEnvioNacional implements IEnvioStrategy {
    @Override
    public double calcular(double peso) {
        if (peso <= 0) {
            return 0;
        }

        return peso * 2.0;
    }
}
