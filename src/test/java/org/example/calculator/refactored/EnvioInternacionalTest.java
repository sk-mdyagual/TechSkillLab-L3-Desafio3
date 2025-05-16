package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioInternacionalTest {

    private EnvioInternacional envioInternacional;

    @Test
    void calcularEnvioLocalRetornaTotalCosto() {

        envioInternacional = new EnvioInternacional();

        assertEquals(30.0, envioInternacional.calcular(10.0));
    }
}