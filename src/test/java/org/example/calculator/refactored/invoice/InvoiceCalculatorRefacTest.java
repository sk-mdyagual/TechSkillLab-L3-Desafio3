package org.example.calculator.refactored.invoice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorRefacTest {

    private ImpEstrategia impMockEstrategia;
    private InvoiceCalculatorRefac invoiceCalculatorRefac;
    double amount;

    @BeforeEach
    void setUp() {
        impMockEstrategia = Mockito.mock(ImpEstrategia.class);
        invoiceCalculatorRefac = new InvoiceCalculatorRefac(impMockEstrategia);
        amount = 100.0;
    }

    @Test
    void calcularTotalConImpuestoIVARetornaSumaMontoEImpuesto() {
        Mockito.when(impMockEstrategia.calcularImpuesto(amount)).thenReturn(19.0);
        double resultado = invoiceCalculatorRefac.calcularTotal(amount);
        assertEquals(119.0, resultado);
    }

    @Test
    void calcularTotalConImpuestoExtraRetornaSumaMontoEImpuesto() {
        Mockito.when(impMockEstrategia.calcularImpuesto(amount)).thenReturn(5.0);
        double resultado = invoiceCalculatorRefac.calcularTotal(amount);
        assertEquals(105.0, resultado);
    }
}