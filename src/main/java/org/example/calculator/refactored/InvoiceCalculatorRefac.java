package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {

    private final ImpEstrategia estrategia;

    public InvoiceCalculatorRefac(ImpEstrategia estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularTotal(double amount) {
        return amount + estrategia.calcular(amount);
    }
    //TO DO


}
