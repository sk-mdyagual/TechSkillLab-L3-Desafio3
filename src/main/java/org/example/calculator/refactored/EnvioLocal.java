package org.example.calculator.refactored;

public class EnvioLocal implements ImpEnvioEstrategia {

    private static final double COSTO_POR_KILO = 1.5;

    @Override
    public double calcular(double peso) {
        return peso * COSTO_POR_KILO; // Costo de envío local
    }
}
