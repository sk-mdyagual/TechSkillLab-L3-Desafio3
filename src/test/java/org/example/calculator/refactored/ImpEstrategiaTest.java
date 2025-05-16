package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ImpEstrategiaTest {
    ImpEstrategia impEstrategia;
    double amount;

    @BeforeEach
    void setUp(){
        amount = 100.0;
    }

    @Test
    void calcularImpuestoIVA_debeCalcular15(){
        impEstrategia = new ImpuestoIVA();
        assertEquals(15.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoExtra_debeCalcular10(){
        impEstrategia = new ImpExtra();
        assertEquals(10.0, impEstrategia.calcular(amount));
    }

    @Test
    void calcularImpuestoSolidario_debeCalcular5(){
        impEstrategia = new ImpuestoSolidario();
        assertEquals(5.0, impEstrategia.calcular(amount));
    }
}
