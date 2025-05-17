package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnvioCalculatorTest {

    private final EnvioCalculator calculator = new EnvioCalculator();

    @Test
    void testEnvioLocal() {
        double result = calculator.calcularEnvio(10, "local");
        assertEquals(15.0, result, 0.01);
    }

    @Test
    void testEnvioNacional() {
        double result = calculator.calcularEnvio(10, "nacional");
        assertEquals(20.0, result, 0.01);
    }

    @Test
    void testEnvioInternacional() {
        double result = calculator.calcularEnvio(10, "internacional");
        assertEquals(30.0, result, 0.01);
    }

    @Test
    void testPesoCero() {
        double result = calculator.calcularEnvio(0, "local");
        assertEquals(0.0, result);
    }

    @Test
    void testZonaNula() {
        double result = calculator.calcularEnvio(10, null);
        assertEquals(0.0, result);
    }

    @Test
    void testZonaVacia() {
        double result = calculator.calcularEnvio(10, "");
        assertEquals(0.0, result);
    }

    @Test
    void testZonaInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calcularEnvio(10, "marte");
        });
    }
}
