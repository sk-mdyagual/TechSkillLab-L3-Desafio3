package org.example.calculator.refactored;

public class EnvioLocal implements EnvioEstrategia{
    private static final double TARIFA_LOCAL = 1.5;
    @Override
    public double calcularEnvio(double peso)
    {
        return peso * TARIFA_LOCAL;

    }
}
