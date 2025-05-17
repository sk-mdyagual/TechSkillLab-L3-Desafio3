package org.example.calculator.refactored;

public class EnvioInternacional implements ImpEnvioEstrategia {

    private static final double COSTO_POR_KILO = 3.0;

    @Override
    public double calcular(double peso) {
        return peso * COSTO_POR_KILO;
    }
}
