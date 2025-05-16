package org.example.calculator.entrega3;

public class EstrategiaEnvioFactory {
    public ImpEstrategiaEnvio obtenerEstrategia(String zona) {
        return switch (zona) {
            case "local" -> new ValorEnvioLocal();
            case "nacional" -> new ValorEnvioNacional();
            case "internacional" -> new ValorEnvioInternacional();
            default -> throw new IllegalArgumentException("Zona no válida");
        };
    }
}

