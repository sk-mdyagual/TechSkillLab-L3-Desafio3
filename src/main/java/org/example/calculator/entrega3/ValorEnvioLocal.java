package org.example.calculator.entrega3;

public class ValorEnvioLocal implements ImpEstrategiaEnvio {
    private static final double LOCAL_RATE = 1.5;

    @Override
    public double calcularEnvio(double peso) {
        return peso * LOCAL_RATE;
    }
}
