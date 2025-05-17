package org.example.calculator.refactored;

public class EnvioCalculatorRefactor {
    private final EnvioEstrategia zonaEnvio;

    public EnvioCalculatorRefactor(EnvioEstrategia zonaEnvio) {
        this.zonaEnvio = zonaEnvio;
    }
    public double calcularEnvio(double peso) {

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor que cero.");
        }
        return zonaEnvio.calcularEnvio(peso);
    }
}
