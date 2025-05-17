package org.example.calculator.refactored.envio;

public class Internacional implements ZonaDeEnvio {
    @Override
    public double calcularCosto(double peso) {
        return peso * 3.0;
    }
}
