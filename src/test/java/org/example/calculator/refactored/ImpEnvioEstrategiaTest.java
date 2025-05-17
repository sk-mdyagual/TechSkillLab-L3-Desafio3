package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEnvioEstrategiaTest {

    ImpEnvioEstrategia impEnvioEstrategia;
    double peso;

    @BeforeEach
    void setUp() {
        peso = 10.0;
    }

    @Test
    void calcular_EnvioLocal() {
        impEnvioEstrategia = new EnvioLocal();
        assertEquals(15.0, impEnvioEstrategia.calcular(peso));
    }

    @Test
    void calcular_EnvioNacional() {
        impEnvioEstrategia = new EnvioNacional();
        assertEquals(20.0, impEnvioEstrategia.calcular(peso));
    }

    @Test
    void calcular_EnvioInternacional() {
        impEnvioEstrategia = new EnvioInternacional();
        assertEquals(30.0, impEnvioEstrategia.calcular(peso));
    }

    @Test
    void calcular_EnvioLocal_peso0() {
        peso = 0.0;
        impEnvioEstrategia = new EnvioLocal();
        assertEquals(0.0, impEnvioEstrategia.calcular(peso));
    }

    @Test
    void calcular_EnvioException() {
        impEnvioEstrategia = new EnvioException();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            impEnvioEstrategia.calcular(peso);
        });
        assertEquals("Zona no válida", exception.getMessage());

    }
}