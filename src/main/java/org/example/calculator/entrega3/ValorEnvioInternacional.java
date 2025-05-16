package org.example.calculator.entrega3;

public class ValorEnvioInternacional implements ImpEstrategiaEnvio {

    private static final double INTERNATIONAL_RATE = 3.0 ;

    @Override
    public double calcularEnvio(double peso) {
        return peso * INTERNATIONAL_RATE;
    }
}
