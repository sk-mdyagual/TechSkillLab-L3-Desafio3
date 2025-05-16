package org.example.calculator.refactored;

public class InvoiceCalculatorRefac {

    private final ITaxes tax;

    public InvoiceCalculatorRefac(ITaxes tax) {
        this.tax = tax;
    }

    public double calculateTotal(double amount) {
        if (amount <= 0) {
            return 0;
        }
        return amount + tax.calculateTax(amount);
    }

}
