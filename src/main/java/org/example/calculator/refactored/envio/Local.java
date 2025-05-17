package org.example.calculator.refactored.envio;

public class Local implements ZonaDeEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 1.5;
    }
}
