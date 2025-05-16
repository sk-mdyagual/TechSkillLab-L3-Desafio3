package org.example.calculator.refactored.invoice;

public class InvoiceCalculatorRefac {
    private final ImpEstrategia impuesto;

    public InvoiceCalculatorRefac(ImpEstrategia impuesto) {
        this.impuesto = impuesto;
    }

    public double calcularTotal(double amount) {
        double impuestoCalculado = impuesto.calcularImpuesto(amount);
        return amount + impuestoCalculado;
    }

}
