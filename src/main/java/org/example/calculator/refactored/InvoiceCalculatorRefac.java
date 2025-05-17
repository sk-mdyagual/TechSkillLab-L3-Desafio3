package org.example.calculator.refactored;

import org.example.calculator.EnvioInternacional;
import org.example.calculator.EnvioLocal;
import org.example.calculator.EnvioNacional;
import org.example.calculator.Envios;

public class InvoiceCalculatorRefac {
    public double calcularEnvio(double peso, String zona) {
        if (peso <= 0 || zona == null || zona.isEmpty()) {
            return 0;
        }

        Envios strategy = getStrategy(zona.toLowerCase());

        return strategy.calcular(peso);
    }

    private Envios getStrategy(String zona) {
        return switch (zona) {
            case "local" -> new EnvioLocal();
            case "nacional" -> new EnvioNacional();
            case "internacional" -> new EnvioInternacional();
            default -> throw new IllegalArgumentException("Zona no válida: " + zona);
        };
    }
}
