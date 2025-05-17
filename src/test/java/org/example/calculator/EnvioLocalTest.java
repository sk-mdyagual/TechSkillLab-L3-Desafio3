package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnvioLocalTest {

    private final Envios envio = new EnvioLocal();

    @Test
    void testCalculoEnvioPositivo() {
        double resultado = envio.calcular(10);
        assertEquals(15.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoDecimal() {
        double resultado = envio.calcular(3.2);
        assertEquals(4.8, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoCero() {
        double resultado = envio.calcular(0);
        assertEquals(0.0, resultado, 0.01);
    }

    @Test
    void testCalculoConPesoNegativo() {
        double resultado = envio.calcular(-4);
        assertEquals(-6.0, resultado, 0.01);
    }
}
