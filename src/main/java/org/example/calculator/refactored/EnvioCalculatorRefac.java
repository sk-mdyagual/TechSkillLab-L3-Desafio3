package org.example.calculator.refactored;

public class EnvioCalculatorRefac {
    private final ImpEstrategia envio;

    public EnvioCalculatorRefac(ImpEstrategia envio) {
        this.envio = envio;
    }

    public double calcularTotal(double amount){
        if (amount <= 0) {
            return 0.0;
        }
        return amount + envio.calcular(amount);
    }

}
