package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioLocalTest {

    private EnvioLocal envioLocal;

    @Test
    void calcularEnvioLocalRetornaTotalCosto() {
        envioLocal = new EnvioLocal();
        assertEquals(15.0, envioLocal.calcular(10.0));
    }
}