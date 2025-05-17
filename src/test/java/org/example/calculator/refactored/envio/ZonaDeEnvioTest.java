package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZonaDeEnvioTest {

    @Test
    void zonaLocal_CalculoCorrecto() {
        ZonaDeEnvio zona = new Local();
        assertEquals(7.5, zona.calcularCosto(5.0));
        assertEquals(0.0, zona.calcularCosto(0.0));
    }

    @Test
    void zonaNacional_CalculoCorrecto() {
        ZonaDeEnvio zona = new Nacional();
        assertEquals(10.0, zona.calcularCosto(5.0));
        assertEquals(0.0, zona.calcularCosto(0.0));
    }

    @Test
    void zonaInternacional_CalculoCorrecto() {
        ZonaDeEnvio zona = new Internacional();
        assertEquals(15.0, zona.calcularCosto(5.0));
        assertEquals(0.0, zona.calcularCosto(0.0));
    }

    @Test
    void zonaLocal_PesoDecimal() {
        ZonaDeEnvio zona = new Local();
        assertEquals(3.75, zona.calcularCosto(2.5));
    }

    @Test
    void zonaInternacional_PesoDecimal() {
        ZonaDeEnvio zona = new Internacional();
        assertEquals(6.6, zona.calcularCosto(2.2), 0.01);
    }

    @Test
    void zonaNacional_PesoNegativo() {
        ZonaDeEnvio zona = new Nacional();
        double resultado = zona.calcularCosto(-5.0);
        assertEquals(-10.0, resultado);
    }
}
