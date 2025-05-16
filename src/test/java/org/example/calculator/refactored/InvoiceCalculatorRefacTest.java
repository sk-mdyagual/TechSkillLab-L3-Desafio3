package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorRefacTest {
    @Test
    void calcularConIVA_RetornaMontoCorrecto() {
        InvoiceCalculatorRefac calculator = new InvoiceCalculatorRefac(new IVAInvoiceStrategy());
        double resultado = calculator.calculate(100);
        assertEquals(119.0, resultado, 0.0001, "Debe aplicar IVA del 19%");
    }

    @Test
    void calcularConRecargo_RetornaMontoCorrecto() {
        InvoiceCalculatorRefac calculator = new InvoiceCalculatorRefac(new RecargoInvoiceStrategy());
        double resultado = calculator.calculate(100);
        assertEquals(105.0, resultado, 0.0001, "Debe aplicar recargo del 5%");
    }

    @Test
    void calcularSinImpuesto_RetornaMontoOriginal() {
        InvoiceCalculatorRefac calculator = new InvoiceCalculatorRefac(new SinImpuestoInvoiceStrategy());
        double resultado = calculator.calculate(100);
        assertEquals(100.0, resultado, 0.0001, "No debe aplicar ningún impuesto");
    }
}