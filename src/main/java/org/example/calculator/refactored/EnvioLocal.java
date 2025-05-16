package org.example.calculator.refactored;

public class EnvioLocal implements ICalcular {

    private static final double LOCAL = 1.5;

    @Override
    public double calcular(double peso) {
        return peso * LOCAL;
    }
}
