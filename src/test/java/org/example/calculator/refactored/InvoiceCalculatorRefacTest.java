package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorRefacTest {

    private ImplEstrategia impMock;
    private InvoiceCalculatorRefac invoiceCalculatorRefac;
    double amount;

    @BeforeEach
    void setUp() {
        impMock = Mockito.mock(ImplEstrategia.class);
        invoiceCalculatorRefac = new InvoiceCalculatorRefac(impMock);
        amount = 100;
    }

    @Test
    void calcularTotalConImpuestos() {
        Mockito.when(impMock.calcular(amount)).thenReturn(15.0);
        double total = invoiceCalculatorRefac.calcularTotal(amount);
        assertEquals(1500, total);
        Mockito.verify(impMock, Mockito.times(1)).calcular(amount);
    }

}