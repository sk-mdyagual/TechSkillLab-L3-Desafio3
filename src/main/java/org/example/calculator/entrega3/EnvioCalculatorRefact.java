package org.example.calculator.entrega3;

public class EnvioCalculatorRefact {

    private final EstrategiaEnvioFactory estrategia;

    public EnvioCalculatorRefact(EstrategiaEnvioFactory estrategia){
        this.estrategia = estrategia;
    }

    public double calcularEnvioTotal(double peso, String zona){

        if (peso <= 0 || zona == null || zona.isEmpty()) {
            return 0;
        }

        ImpEstrategiaEnvio impEstrategiaEnvio = estrategia.obtenerEstrategia(zona);

        return impEstrategiaEnvio.calcularEnvio(peso);
    }
}
