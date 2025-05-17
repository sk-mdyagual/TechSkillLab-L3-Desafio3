package org.example.calculator.refactored.envio;

public class Nacional implements ZonaDeEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 2.0;
    }
}
