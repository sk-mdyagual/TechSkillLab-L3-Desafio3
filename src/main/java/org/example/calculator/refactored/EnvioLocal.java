package org.example.calculator.refactored;

public class EnvioLocal implements ImpEstrategia {
    private static final double ENVIO_LOCAL = 0.10;

    @Override
    public double calcular(double amount){
        return amount * ENVIO_LOCAL;
    }

}
