package org.example.calculator.refactored;

public class ImplEnvioLocal implements IEnvioStrategy {

    @Override
    public double calcular(double peso) {
        if (peso <= 0) {
            return 0;
        }

        return peso * 1.5;
    }
}
