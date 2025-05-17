package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnvioNacionalTest {

    private final Envios envio = new EnvioNacional();

    @Test
    void testCalculoEnvioPositivo() {
        double resultado = envio.calcular(10);
        assertEquals(20.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoDecimal() {
        double resultado = envio.calcular(2.5);
        assertEquals(5.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoCero() {
        double resultado = envio.calcular(0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoNegativo() {
        double resultado = envio.calcular(-3);
        assertEquals(-6.0, resultado, 0.01);
    }
}
