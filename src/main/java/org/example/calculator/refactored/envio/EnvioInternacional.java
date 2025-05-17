package org.example.calculator.refactored.envio;

public class EnvioInternacional implements EnvioEstrategia {
    private static final double ENVIO_INTERNACIONAL = 3.0;

    @Override
    public double calcular(double peso) {
        return peso * ENVIO_INTERNACIONAL;
    }
}
