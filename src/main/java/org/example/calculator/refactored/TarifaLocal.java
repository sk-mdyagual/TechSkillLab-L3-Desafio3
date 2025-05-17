package org.example.calculator.refactored;

public class TarifaLocal implements TarifaEstategia {

    private static final double factorTarifaLocal = 1.5;

    @Override
    public double calcular(double peso) {
        return peso * factorTarifaLocal;
    }
}
