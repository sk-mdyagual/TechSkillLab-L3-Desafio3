package org.example.calculator.refactored;

public class EnvioCalculatorRefac {
    private final TarifaEstategia tarifaZona;

    public EnvioCalculatorRefac(TarifaEstategia tarifaZona) {
        this.tarifaZona = tarifaZona;
    }

    public double CalcularEnvio(double peso){
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        return tarifaZona.calcular(peso);
    }
}
