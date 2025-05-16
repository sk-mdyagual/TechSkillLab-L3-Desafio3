package org.example.calculator.refactored.invoice;

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
    void calcularImpuestoIvaDebeSerEl19() {
        impEstrategia = new ImpuestoIVA();
        double resultado = impEstrategia.calcularImpuesto(amount);
        assertEquals(19.0, resultado);
    }

    @Test
    void calcularImpuestoExtraDebeSerEl5() {
        impEstrategia = new ImpuestoExtra();
        double resultado = impEstrategia.calcularImpuesto(amount);
        assertEquals(5.0, resultado);
    }
}