package org.example.calculator.entrega3;

public class ValorEnvioNacional implements ImpEstrategiaEnvio {

    private static final double NATIONAL_RATE = 2.0;

    @Override
    public double calcularEnvio(double peso) {
        return peso * NATIONAL_RATE;
    }
}
