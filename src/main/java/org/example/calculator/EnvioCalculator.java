package org.example.calculator;

public class EnvioCalculator {
    public double calcularEnvio(double peso, String zona){
        if (peso <= 0) {
            return 0;
        }
        if (zona == null || zona.isEmpty()) {
            return 0;

        }

        return switch (zona) {
            case "local" -> peso * 1.5;
            case "nacional" -> peso * 2.0;
            case "internacional" -> peso * 3.0;
            default -> throw new IllegalArgumentException("Zona no válida");
        };
    }
}
