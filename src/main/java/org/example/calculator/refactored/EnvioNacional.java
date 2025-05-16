package org.example.calculator.refactored;

public class EnvioNacional implements ImplCalculoEnvio {
    @Override
    public double calcular(double peso) {
        return peso * 2.0;
    }
}
