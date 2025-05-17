package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaTest {

    ImpEstrategia impEstrategia;
    double amount;

    @BeforeEach
    void setUp() {
        amount = 100.0;
    }
    @Test
    void calcularImpuestoIva_debeCalcularEl15PorCiento() {
        impEstrategia = new ImpuestoIva();
        assertEquals(16.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoRecargo_debeCalcularEl10PorCiento() {
        impEstrategia = new ImpuestoRecargo();
        assertEquals(10.0, impEstrategia.calcular(amount));
    }
}