package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceCalculatorRefacTest {

    private ITaxes taxMock;
    private InvoiceCalculatorRefac invoiceCalculatorRefac;
    double monto;

    @BeforeEach
    void setUp() {
        taxMock = Mockito.mock(ITaxes.class);
        invoiceCalculatorRefac = new InvoiceCalculatorRefac(taxMock);
        monto = 100.0;
    }

    @Test
    void calculateTotalConImpuestoIva_retornaSumaMontoEImpuesto() {
        Mockito.when(taxMock.calculateTax(monto)).thenReturn(15.0);

        double total = invoiceCalculatorRefac.calculateTotal(monto);

        assertEquals(115.0, total);
        Mockito.verify(taxMock, Mockito.times(1)).calculateTax(monto);
    }

    @Test
    void calculateTotalConImpuestoExtra_retornaSumaMontoEImpuesto() {
        Mockito.when(taxMock.calculateTax(monto)).thenReturn(10.0);

        double total = invoiceCalculatorRefac.calculateTotal(monto);

        assertEquals(110.0, total);
        Mockito.verify(taxMock, Mockito.times(1)).calculateTax(monto);
    }
}