package org.example.calculator.refactored;

public class NacionalStrategy implements ZonaEnvioStrategy {
    @Override
    public double calcularCosto(double peso) {
        return peso * 2.0;
    }
}
