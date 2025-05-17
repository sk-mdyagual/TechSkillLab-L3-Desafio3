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
    void calcularTotalConIVA_RetornaSumaMonyoEImpuesto(){
        Mockito.when(impMock.calcular(amount)).thenReturn(19.0);

        double total = invoiceCalculatorRefac.calcularTotal(amount);

        assertEquals(119.0,total);

        Mockito.verify(impMock,Mockito.times(1)).calcular(amount);
    }

    @Test
    void calcularTotalConImpuestoExtra_RetornaSumaMonyoEImpuesto(){
        Mockito.when(impMock.calcular(amount)).thenReturn(10.0);

        double total = invoiceCalculatorRefac.calcularTotal(amount);

        assertEquals(110.0,total);

        Mockito.verify(impMock,Mockito.times(1)).calcular(amount);
    }

    @Test
    void calcularTotalConImpuestoSolidario_RetornaSumaMonyoEImpuesto(){
        Mockito.when(impMock.calcular(amount)).thenReturn(5.0);

        double total = invoiceCalculatorRefac.calcularTotal(amount);

        assertEquals(105.0,total);

        Mockito.verify(impMock,Mockito.times(1)).calcular(amount);
    }

}