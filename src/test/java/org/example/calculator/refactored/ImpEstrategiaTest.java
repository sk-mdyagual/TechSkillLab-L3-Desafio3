package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaTest {
    ImpEstrategia impEstrategia;
    double amount;
    @BeforeEach
    void setUp(){
        amount=100.0;
    }

    @Test
    void calcularImpuestoIVA_debecalcularel19Porciento(){
        impEstrategia = new ImpuestoIVA();
        assertEquals(19.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoExtra_debecalcularel10Porciento(){
        impEstrategia = new ImpuestoExtra();
        assertEquals(10.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoSolidario_debecalcularel5Porciento(){
        impEstrategia = new ImpuestoSolidario();
        assertEquals(5.0, impEstrategia.calcular(amount));
    }

}