package org.example.calculator.refactored.envio;

public class EnvioCalculatorRefact {

    private final ZonaDeEnvio zona;

    public EnvioCalculatorRefact(ZonaDeEnvio zona) {
        this.zona = zona;
    }

    public double calcularElEnvio(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero");
        } else {
            return zona.calcularCosto(peso);
        }
    }
}
