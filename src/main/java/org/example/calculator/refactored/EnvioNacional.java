package org.example.calculator.refactored;

public class EnvioNacional implements ImpEnvioEstrategia {

    private static final double COSTO_POR_KILO = 2.0;

    @Override
    public double calcular(double peso) {
        return peso * COSTO_POR_KILO;
    }
}
