package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IvaTest {

    @Test
    void testAplicarIvaConMontoPositivo() {
        double resultado = Iva.aplicarIva(100.0);
        assertEquals(119.0, resultado, 0.001);
    }

    @Test
    void testAplicarIvaConMontoCero() {
        double resultado = Iva.aplicarIva(0.0);
        assertEquals(0.0, resultado, 0.001);
    }

    @Test
    void testAplicarIvaConMontoNegativo() {
        double resultado = Iva.aplicarIva(-50.0);
        assertEquals(-59.5, resultado, 0.001);
    }
}
