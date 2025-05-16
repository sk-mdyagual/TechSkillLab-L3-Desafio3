package org.example.calculator;

public class EnvioCalculator {
    private final EnvioEstrategia estrategia;

    public EnvioCalculator(EnvioEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularEnvio(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }
        return estrategia.calcular(peso);
    }
}