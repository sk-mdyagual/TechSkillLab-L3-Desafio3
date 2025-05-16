package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorRefacTest {
    private ImpEstrategia impMock;
    private InvoiceCalculatorRefac invoiceCalculatorRefac;
    double amount;

    @BeforeEach
    void setUp(){
        impMock = Mockito.mock(ImpEstrategia.class);
        invoiceCalculatorRefac = new InvoiceCalculatorRefac(impMock);
        amount = 100.0;
    }

    @Test
    void calcularTotalConImpuestoIVA_debeCalcular15(){
        Mockito.when(impMock.calcular(amount)).thenReturn(15.0);
        double total = invoiceCalculatorRefac.calcularTotal(amount);
        assertEquals(115.0, total);
    }

}