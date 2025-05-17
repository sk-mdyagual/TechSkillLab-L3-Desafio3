package org.example.calculator.refactored.envio;

public class EnvioNacional implements EnvioEstrategia{
    private static final double ENVIO_NACIONAL = 2.0;

    @Override
    public double calcular(double peso) {
        return peso * ENVIO_NACIONAL;
    }
}
