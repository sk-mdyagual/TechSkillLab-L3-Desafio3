package org.example.calculator
        ;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorTest {

    @Test
    void calcularEnvioLocal() {
        EnvioEstrategia estrategiaLocal = new EnvioLocal();
        EnvioCalculator calculator = new EnvioCalculator(estrategiaLocal);

        double resultado = calculator.calcularEnvio(10.0);
        assertEquals(15.0, resultado, 0.01);
    }

    @Test
    void calcularEnvioInternacional() {
        EnvioEstrategia estrategiaInternacional = new EnvioInternacional();
        EnvioCalculator calculator = new EnvioCalculator(estrategiaInternacional);

        double resultado = calculator.calcularEnvio(10.0);
        assertEquals(30.0, resultado, 0.01);
    }

    @Test
    void calcularEnvioConPesoInvalido() {
        EnvioEstrategia estrategiaLocal = new EnvioLocal();
        EnvioCalculator calculator = new EnvioCalculator(estrategiaLocal);

        assertThrows(IllegalArgumentException.class, () -> calculator.calcularEnvio(0));
    }

    @Test
    void calcularEnvioNacional() {
        EnvioEstrategia estrategiaNacional = new EnvioNacional();
        EnvioCalculator calculator = new EnvioCalculator(estrategiaNacional);

        double resultado = calculator.calcularEnvio(10.0);
        assertEquals(20.0, resultado, 0.01);
    }
}