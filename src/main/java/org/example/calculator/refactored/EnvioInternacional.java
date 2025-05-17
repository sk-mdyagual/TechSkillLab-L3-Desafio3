package org.example.calculator.refactored;

public class EnvioInternacional implements EnvioEstrategia{
    private static final double TARIFA_INTERNACIONAL = 3.0;

    @Override
    public double calcularEnvio(double peso)
    {
        return peso * TARIFA_INTERNACIONAL;
    }
}
