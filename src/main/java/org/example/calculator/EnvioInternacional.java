package org.example.calculator;

public class EnvioInternacional implements EnvioEstrategia {
    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }
}