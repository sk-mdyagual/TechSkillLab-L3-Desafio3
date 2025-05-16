package org.example.calculator.refactored;

public class EnvioCalculatorRefac {

    private final ImplCalculoEnvio implCalculoEnvio;

    public EnvioCalculatorRefac(ImplCalculoEnvio implCalculoEnvio) {
        this.implCalculoEnvio = implCalculoEnvio;
    }

    public double calcularEnvio(double peso, String zona) {
        if (peso <= 0 || zona == null || zona.isEmpty()) {
            return 0;
        }
        return implCalculoEnvio.calcular(peso);
    }
}
