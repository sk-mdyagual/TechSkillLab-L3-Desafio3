package org.example.calculator.refactored.envio;

public class EnvioCalculatorRefactor {
    private final EnvioEstrategia envio;

    public EnvioCalculatorRefactor(EnvioEstrategia envio) {
        this.envio = envio;
    }

    public double calcularTotal(double peso) {
        return peso + envio.calcular(peso);
    }
}
