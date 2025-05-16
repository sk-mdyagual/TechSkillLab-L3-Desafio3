package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioInterNacionalTest {

    @Test
    void calcular_con_peso_positivo() {
        ImplCalculoEnvio envioInterNacional = new EnvioInterNacional();
        double resultado = envioInterNacional.calcular(10.0);
        assertEquals(30.0, resultado);
    }

    @Test
    void calcular_con_peso_en_cero() {
        ImplCalculoEnvio envioInterNacional = new EnvioInterNacional();
        double resultado = envioInterNacional.calcular(0.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void calcular_con_peso_negativo() {
        ImplCalculoEnvio envioInterNacional = new EnvioInterNacional();
        double resultado = envioInterNacional.calcular(-5.0);
        assertEquals(-15, resultado);
    }

}