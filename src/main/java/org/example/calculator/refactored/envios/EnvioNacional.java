package org.example.calculator.refactored.envios;

public class EnvioNacional implements EnvioEstrategia {
    private static final double FACTOR = 2.0;

    @Override
    public double calcularEnvio(double peso) {
        return peso * FACTOR;
    }
}
