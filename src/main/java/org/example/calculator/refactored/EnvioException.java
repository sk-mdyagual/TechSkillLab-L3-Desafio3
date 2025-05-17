package org.example.calculator.refactored;

public class EnvioException implements ImpEnvioEstrategia {

    @Override
    public double calcular(double peso) {
        throw new IllegalArgumentException("Zona no válida");
    }
}
