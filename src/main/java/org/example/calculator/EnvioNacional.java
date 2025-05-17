package org.example.calculator;

public class EnvioNacional implements Envios {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}
