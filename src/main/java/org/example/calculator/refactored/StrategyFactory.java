package org.example.calculator.refactored;

public class StrategyFactory {
    public static ImplCalculoEnvio getStrategy(String zona) {
        return switch (zona.toLowerCase()) {
            case "local" -> new EnvioLocal();
            case "nacional" -> new EnvioNacional();
            case "internacional" -> new EnvioInterNacional();
            default -> throw new IllegalArgumentException("Zona no válida");
        };
    }
}
