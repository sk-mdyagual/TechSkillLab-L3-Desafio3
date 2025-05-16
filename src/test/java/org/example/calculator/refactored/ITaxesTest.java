package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITaxesTest {

    ITaxes tax;
    private double amount;

    @BeforeEach
    void setUp() {
        amount = 100.0;
    }

    @Test
    void calcularImpuestoIva_debeCalcularEl15Porciento() {
        tax = new IvaTax();
        assertEquals(15.0, tax.calculateTax(amount));
    }

    @Test
    void calcularImpuestoExtra_debeCalcularEl10Porciento() {
        tax = new ExtraTax();
        assertEquals(10.0, tax.calculateTax(amount));
    }

    @Test
    void calcularImpuestoIva_debeCalcularEl0Porciento() {
        amount = 0.0;
        tax = new IvaTax();
        assertEquals(0.0, tax.calculateTax(amount));
    }

    @Test
    void calcularImpuestoExtra_debeCalcularEl0Porciento() {
        amount = 0.0;
        tax = new ExtraTax();
        assertEquals(0.0, tax.calculateTax(amount));
    }

}