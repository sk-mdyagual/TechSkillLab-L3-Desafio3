package org.example.calculator.refactored;

public class EnvioInternacional  implements ImpEstrategia{
    private static final double Envio_Internacional = 0.20;

    @Override
    public double calcular(double amount) {
        return amount * Envio_Internacional;
    }
}
