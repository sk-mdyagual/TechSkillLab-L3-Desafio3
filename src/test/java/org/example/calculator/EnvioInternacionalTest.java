package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnvioInternacionalTest {

    private final Envios envio = new EnvioInternacional();

    @Test
    void testCalculoEnvioPositivo() {
        double resultado = envio.calcular(10);
        assertEquals(30.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoDecimal() {
        double resultado = envio.calcular(2.5);
        assertEquals(7.5, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoCero() {
        double resultado = envio.calcular(0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoNegativo() {
        double resultado = envio.calcular(-5);
        assertEquals(-15.0, resultado, 0.01);
    }
}
