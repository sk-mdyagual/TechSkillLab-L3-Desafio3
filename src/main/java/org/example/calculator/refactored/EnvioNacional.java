package org.example.calculator.refactored;

public class EnvioNacional implements ICalcular{

    private static final double NACIONAL = 2.0;

    @Override
    public double calcular(double peso) {
        return peso * NACIONAL;
    }
}
