package org.example.calculator.refactored;

public class InternacionalStrategy implements ZonaEnvioStrategy {
    @Override
    public double calcularCosto(double peso) {
        return peso * 3.0;
    }
}
