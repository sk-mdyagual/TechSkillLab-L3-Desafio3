package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {
    private final ImpEstrategia impuesto;

    public InvoiceCalculatorRefac(ImpEstrategia impuesto){
        this.impuesto=impuesto;
    }

    public double calcularTotal(double amount){
        return amount + impuesto.calcular(amount);
    }



}
