package org.example.calculator.refactored;

public class LocalStrategy implements ZonaEnvioStrategy {
    @Override
    public double calcularCosto(double peso) {
        return peso * 1.5;
    }
}
