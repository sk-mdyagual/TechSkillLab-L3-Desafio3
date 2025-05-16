package org.example.calculator.refactored;

import org.example.calculator.InvoiceCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class InvoiceCalculatorRefacTest {

    private ImpEstrategia estrategiaIVA;
    private InvoiceCalculatorRefac invoiceCalculatorIVA;

    @BeforeEach
    void setUp() {
        estrategiaIVA = Mockito.mock(ImpEstrategia.class);
        invoiceCalculatorIVA = new InvoiceCalculatorRefac(estrategiaIVA);
    }

    @Test
    void calcularTotalConImpuesto_retornarSUmaMonto(){
    when(estrategiaIVA.calcular(100.0)).thenReturn(19.0); // Simulando el cálculo del IVA
        double total = invoiceCalculatorIVA.calcularTotal(100.0);
        assertEquals(119.0, total, 0.01);

        verify(estrategiaIVA).calcular(100.0); // Verifica que se llamó al método calcular con el monto correcto
    }

}