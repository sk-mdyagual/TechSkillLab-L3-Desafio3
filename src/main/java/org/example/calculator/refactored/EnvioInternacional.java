package org.example.calculator.refactored;

public class EnvioInternacional implements ICalcular{

    private static final double INTERNACIONAL = 3.0;

    @Override
    public double calcular(double peso) {
        return peso * INTERNACIONAL;
    }
}
