package org.example.calculator;

public class EnvioNacional implements EnvioEstrategia {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}