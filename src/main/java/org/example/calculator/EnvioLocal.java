package org.example.calculator;

public class EnvioLocal implements EnvioEstrategia {
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }
}