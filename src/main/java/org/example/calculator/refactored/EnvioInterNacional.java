package org.example.calculator.refactored;

public class EnvioInterNacional implements ImplCalculoEnvio {
    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }
}
