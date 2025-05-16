package org.example.calculator.refactored.envios;

public class EnvioLocal implements EnvioEstrategia {
    private static final double FACTOR = 1.5;

    @Override
    public double calcularEnvio(double peso) {
        if(peso <= 0){
            return 0;
        }
        return peso * FACTOR;
    }
}
