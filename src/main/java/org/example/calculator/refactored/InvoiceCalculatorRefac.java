package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {
    private final ImpEstrategia impuesto;

    public InvoiceCalculatorRefac(ImpEstrategia impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularTotal(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount + impuesto.calcular(amount);
    }


}
