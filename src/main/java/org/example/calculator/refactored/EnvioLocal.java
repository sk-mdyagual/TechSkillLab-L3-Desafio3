package org.example.calculator.refactored;

public class EnvioLocal implements ImplCalculoEnvio {
    @Override
    public double calcular(double peso) {
        return peso * 1.5;
    }
}
