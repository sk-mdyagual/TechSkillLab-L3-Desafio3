package org.example.calculator.refactored;

public class TarifaInternacional implements TarifaEstategia {

    private static final double factorTarifaInternacional = 2.0;
    @Override
    public double calcular(double peso) {
        return peso * factorTarifaInternacional;
    }
}
