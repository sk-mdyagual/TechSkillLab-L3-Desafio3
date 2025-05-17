package org.example.calculator.refactored.envio;

public class EnvioLocal implements EnvioEstrategia{
    private static final double ENVIO_LOCAL = 1.5;

    @Override
    public double calcular(double peso){
        return peso * ENVIO_LOCAL;
    }
}
