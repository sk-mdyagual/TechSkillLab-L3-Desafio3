package org.example.calculator.refactored;

public class EnvioCalculatorRefac {

    private final ICalcular calcularEnvio;

    public EnvioCalculatorRefac(ICalcular calcularEnvio) {
        this.calcularEnvio = calcularEnvio;
    }

    public double calcularEnvio(double peso) {
        if (peso <= 0) {
            return 0;
        }
        return calcularEnvio.calcular(peso);
    }
}
