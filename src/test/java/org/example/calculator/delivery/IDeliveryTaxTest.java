package org.example.calculator.delivery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IDeliveryTaxTest {
    IDeliveryTax tax;
    private double weight;

    @BeforeEach
    void setUp() {
        weight = 100.0;
    }

    @Test
    void calcularImpuestoEnvioLocal_debeCalcularEl1Porciento() {
        tax = new LocalDeliveryTax();
        assertEquals(150.0, tax.calculateDeliveryTax(weight));
    }

    @Test
    void calcularImpuestoEnvioLocal_debeCalcularEl0Porciento() {
        weight = 0.0;
        tax = new LocalDeliveryTax();
        assertEquals(0.0, tax.calculateDeliveryTax(weight));
    }

    @Test
    void calcularImpuestoEnvioNacional_debeCalcularEl2Porciento() {
        tax = new NationalDeliveryTax();
        assertEquals(200.0, tax.calculateDeliveryTax(weight));
    }

    @Test
    void calcularImpuestoEnvioNacional_debeCalcularEl0Porciento() {
        weight = 0.0;
        tax = new NationalDeliveryTax();
        assertEquals(0.0, tax.calculateDeliveryTax(weight));
    }

    @Test
    void calcularImpuestoEnvioInternacional_debeCalcularEl3Porciento() {
        tax = new InternationalDeliveryTax();
        assertEquals(300.0, tax.calculateDeliveryTax(weight));
    }

    @Test
    void calcularImpuestoEnvioInternacional_debeCalcularEl0Porciento() {
        weight = 0.0;
        tax = new InternationalDeliveryTax();
        assertEquals(0.0, tax.calculateDeliveryTax(weight));
    }
}