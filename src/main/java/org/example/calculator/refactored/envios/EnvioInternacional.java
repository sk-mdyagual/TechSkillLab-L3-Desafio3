package org.example.calculator.refactored.envios;

public class EnvioInternacional implements EnvioEstrategia {
    private static final double FACTOR = 3.0;

    @Override
    public double calcularEnvio(double peso) {
        return peso * FACTOR;
    }
}
