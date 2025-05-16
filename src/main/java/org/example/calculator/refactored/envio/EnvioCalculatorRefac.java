package org.example.calculator.refactored.envio;

public class EnvioCalculatorRefac {

    private final ImpZona zona;

    public EnvioCalculatorRefac(ImpZona zona) {
        this.zona = zona;
    }

    public double calcularEnvio(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero");
        } else {
            return zona.calcularEnvio(peso);
        }
    }
}
