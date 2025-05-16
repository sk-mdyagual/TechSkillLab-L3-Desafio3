package org.example.calculator.refactored.envios;

public class EnvioCalculatorRefac {
    private final EnvioEstrategia tipoEnvio;

    public EnvioCalculatorRefac(EnvioEstrategia tipoEnvio){
        this.tipoEnvio = tipoEnvio;
    }

    public double calcularEnvio(double peso){
        return tipoEnvio.calcularEnvio(peso);
    }


}
