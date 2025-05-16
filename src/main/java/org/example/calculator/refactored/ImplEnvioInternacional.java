package org.example.calculator.refactored;

public class ImplEnvioInternacional implements IEnvioStrategy {

    @Override
    public double calcular(double peso) {
        if (peso <= 0) {
            return 0;
        }

        return peso * 3.0;
    }
}
