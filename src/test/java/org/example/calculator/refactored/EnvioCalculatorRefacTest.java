package org.example.calculator.refactored;

import org.example.calculator.EnvioCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    private EnvioCalculatorRefac calculator;

    @BeforeEach
    void setUp() {
        calculator = new EnvioCalculatorRefac();
    }

    @Test
    void calcularEnvio_Local_RetornaCostoCorrecto() {
        double resultado = calculator.calcularEnvio(10, "local");
        assertEquals(15.0, resultado, 0.0001, "El costo local debe ser peso * 1.5");
    }

    @Test
    void calcularEnvio_Internacional_RetornaCostoCorrecto() {
        double resultado = calculator.calcularEnvio(5, "internacional");
        assertEquals(15.0, resultado, 0.0001, "El costo internacional debe ser peso * 3.0");
    }

    @Test
    void calcularEnvio_PesoInvalido_RetornaCero() {
        double resultado = calculator.calcularEnvio(-2, "local");
        assertEquals(0.0, resultado, "Con peso inválido el costo debe ser 0");
    }

    // Opcional: test para zona inválida
    @Test
    void calcularEnvio_ZonaInvalida_LanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calcularEnvio(10, "extraterrestre");
        });
        assertEquals("Zona no válida", ex.getMessage());
    }
}