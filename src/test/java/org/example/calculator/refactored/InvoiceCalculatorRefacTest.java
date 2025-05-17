package org.example.calculator.refactored;

import org.example.calculator.EnvioInternacional;
import org.example.calculator.EnvioLocal;
import org.example.calculator.EnvioNacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceCalculatorRefacTest {

    private final InvoiceCalculatorRefac calculator = new InvoiceCalculatorRefac();

    @Test
    void testCalcularEnvioLocal() {
        double resultado = calculator.calcularEnvio(10, "local");
        assertEquals(15.0, resultado, 0.001);
    }

    @Test
    void testCalcularEnvioNacional() {
        double resultado = calculator.calcularEnvio(10, "nacional");
        assertEquals(20.0, resultado, 0.001);
    }

    @Test
    void testCalcularEnvioInternacional() {
        double resultado = calculator.calcularEnvio(10, "internacional");
        assertEquals(30.0, resultado, 0.001);
    }

    @Test
    void testPesoCeroDevuelveCero() {
        assertEquals(0.0, calculator.calcularEnvio(0, "local"), 0.001);
    }

    @Test
    void testPesoNegativoDevuelveCero() {
        assertEquals(0.0, calculator.calcularEnvio(-5, "local"), 0.001);
    }

    @Test
    void testZonaNullDevuelveCero() {
        assertEquals(0.0, calculator.calcularEnvio(5, null), 0.001);
    }

    @Test
    void testZonaVaciaDevuelveCero() {
        assertEquals(0.0, calculator.calcularEnvio(5, ""), 0.001);
    }

    @Test
    void testZonaNoValidaLanzaExcepcion() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calcularEnvio(5, "extraterrestre");
        });
        assertTrue(exception.getMessage().contains("Zona no válida"));
    }
}
