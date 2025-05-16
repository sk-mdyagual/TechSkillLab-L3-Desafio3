package org.example.calculator.refactored.envio;

public class ZonaNacional implements  ImpZona{

    private static final double ZONA_NACIONAL = 2.5;

    @Override
    public double calcularEnvio(double peso) {
        return peso * ZONA_NACIONAL;
    }
}
