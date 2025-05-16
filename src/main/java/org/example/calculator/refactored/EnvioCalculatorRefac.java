package org.example.calculator.refactored;

public class EnvioCalculatorRefac {
    private final IEnvioStrategy envioStrategy;

    public EnvioCalculatorRefac(IEnvioStrategy envioStrategy) {
        this.envioStrategy = envioStrategy;
    }

    public double calcularEnvio(double peso){
        return envioStrategy.calcular(peso);
    }
}
