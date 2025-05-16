package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioNacionalTest {

    private EnvioNacional envioNacional;

    @Test
    void calcularEnvioNacionalRetornaTotalCosto() {

        envioNacional = new EnvioNacional();

        assertEquals(20.0, envioNacional.calcular(10.0));
    }
}