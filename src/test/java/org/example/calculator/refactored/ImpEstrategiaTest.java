package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaTest {

    ImpEstrategia impEstrategia;
    double amount;

    @BeforeEach
    void setUp() {
        amount = 100;
    }

    @Test
    void calcularImpuestoIVA_debeCalcularEl15PorCiento() {
        impEstrategia = new ImpuestoIVA();
        assertEquals(15.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoExtra_debeCalcularEl10PorCiento() {
        impEstrategia = new ImpuestoExtra();
        assertEquals(10.0, impEstrategia.calcular(amount));
    }
}