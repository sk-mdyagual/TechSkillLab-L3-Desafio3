package org.example.calculator.refactored.envio;

public class ZonaInternacional implements ImpZona{

    private static final double ZONA_INTERNACIONAL = 5.0;

    @Override
    public double calcularEnvio(double peso) {
        return peso * ZONA_INTERNACIONAL;
    }
}
