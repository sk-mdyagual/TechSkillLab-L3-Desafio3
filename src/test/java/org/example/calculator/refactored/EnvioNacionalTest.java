package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioNacionalTest {

    @Test
    void calcular_con_peso_positivo() {
        ImplCalculoEnvio envioNacional = new EnvioNacional();
        double resultado = envioNacional.calcular(10.0);
        assertEquals(20.0, resultado);
    }

    @Test
    void calcular_con_peso_en_cero() {
        ImplCalculoEnvio envioNacional = new EnvioNacional();
        double resultado = envioNacional.calcular(0.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void calcular_con_peso_negativo() {
        ImplCalculoEnvio envioNacional = new EnvioNacional();
        double resultado = envioNacional.calcular(-5.0);
        assertEquals(-10, resultado);
    }

}