package org.example.calculator.refactored;

import java.util.HashMap;
import java.util.Map;

public class EnvioCalculatorRefac {

    private final Map<String, ZonaEnvioStrategy> estrategias = new HashMap<>();

    public EnvioCalculatorRefac() {
        estrategias.put("local", new LocalStrategy());
        estrategias.put("nacional", new NacionalStrategy());
        estrategias.put("internacional", new InternacionalStrategy());
    }

    public double calcularEnvio(double peso, String zona) {
        if (peso <= 0) {
            return 0;
        }
        if (zona == null || zona.isEmpty()) {
            return 0;
        }

        ZonaEnvioStrategy estrategia = estrategias.get(zona.toLowerCase());
        if (estrategia == null) {
            throw new IllegalArgumentException("Zona no válida");
        }
        return estrategia.calcularCosto(peso);
    }
}
