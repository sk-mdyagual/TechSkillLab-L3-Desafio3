package org.example.calculator.refactored.envio;

public class ZonaLocal implements ImpZona {
    private static final double ZONA_LOCAL = 1.5;

    @Override
    public double calcularEnvio(double peso) {
        return peso * ZONA_LOCAL;
    }

}
