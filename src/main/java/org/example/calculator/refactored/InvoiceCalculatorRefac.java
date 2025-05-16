package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {

    private final ImplEstrategia implEstrategia;

    public InvoiceCalculatorRefac(ImplEstrategia implEstrategia) {
        this.implEstrategia = implEstrategia;
    }

    public double calcularTotal(double amount){
        return amount * implEstrategia.calcular(amount);
    }
}
