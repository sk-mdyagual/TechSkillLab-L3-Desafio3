package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaTest {
    ImpEstrategia impEstrategia;

    @Test
    void calcularEnvioLocal() {
        impEstrategia = new EnvioLocal();
        assertEquals(10.0, impEstrategia.calcular(100.0));
    }

    @Test
    void calcularEnvioInternacional() {
        impEstrategia = new EnvioInternacional();
        assertEquals(20.0, impEstrategia.calcular(100.0));
    }
}