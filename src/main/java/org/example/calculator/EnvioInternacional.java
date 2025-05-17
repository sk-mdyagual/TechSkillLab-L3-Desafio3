package org.example.calculator;

public class EnvioInternacional implements Envios {
    @Override
    public double calcular(double peso) {
        return peso * 3.0;
    }
}
