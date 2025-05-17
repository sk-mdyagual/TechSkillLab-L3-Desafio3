package org.example.calculator.refactored;

public class EnvioNacional implements EnvioEstrategia{
    private static final double TARIFA_NACIONAL = 2.0;

    @Override
    public double calcularEnvio(double peso)
    {
        return peso * TARIFA_NACIONAL;
    }
}
