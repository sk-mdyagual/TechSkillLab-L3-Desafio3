package org.example.calculator.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryCalculatorTest {

    IDeliveryTax deliveryTaxMock;

    DeliveryCalculator deliveryCalculator;

    double weight;

    @BeforeEach
    void setUp() {
        deliveryTaxMock = Mockito.mock(IDeliveryTax.class);
        deliveryCalculator = new DeliveryCalculator(deliveryTaxMock);
        weight = 100.0;
    }

    @Test
    void constructor_conDeliveryTaxNulo_lanzaExcepcion() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                new DeliveryCalculator(null)
        );
        assertEquals("El cálculo de impuestos de envío no puede ser nulo", exception.getMessage());
    }

    @Test
    void calculateDeliveryTax_conPesoNegativo_retornaCero() {
        double result = deliveryCalculator.calculateDeliveryTax(-10.0);
        assertEquals(0.0, result);
        Mockito.verifyNoInteractions(deliveryTaxMock);
    }

    @Test
    void calculateDeliveryTax_conPesoCero_retornaCero() {
        double result = deliveryCalculator.calculateDeliveryTax(0.0);
        assertEquals(0.0, result);
        Mockito.verifyNoInteractions(deliveryTaxMock);
    }

    @Test
    void calculateDeliveryTax_conPesoValido_llamaADeliveryTax() {
        Mockito.when(deliveryTaxMock.calculateDeliveryTax(weight)).thenReturn(150.0);

        double result = deliveryCalculator.calculateDeliveryTax(weight);

        assertEquals(150.0, result);
        Mockito.verify(deliveryTaxMock, Mockito.times(1)).calculateDeliveryTax(weight);
    }

}