package org.example.calculator.refactored;

public class EnvioCalculatorRefac {

    ImpEnvioEstrategia estrategia;

    public EnvioCalculatorRefac(ImpEnvioEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularEnvio(double peso){
        if (peso <= 0) {
            return 0;
        }

        return peso * estrategia.calcular(peso);
    }

    public double calcularEnvio2(double peso){
        if (peso <= 0) {
            return 0;
        }

        if (estrategia == null) {
            throw new IllegalArgumentException("Estrategia de envío no válida");
        }

        double total =  estrategia.calcular(peso);

        if (total <= 0) {
            return 0;
        }

        return total;
    }
}
