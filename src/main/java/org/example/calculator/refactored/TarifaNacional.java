package org.example.calculator.refactored;

public class TarifaNacional implements TarifaEstategia {

    private static final double factorTarifaNacional = 3.0;

    @Override
    public double calcular(double peso) {
        return peso * factorTarifaNacional;
    }
}
