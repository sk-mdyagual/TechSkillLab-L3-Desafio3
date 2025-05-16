package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioLocalTest {

    @Test
    void calcular_con_peso_positivo() {
        ImplCalculoEnvio envioLocal = new EnvioLocal();
        double resultado = envioLocal.calcular(10.0);
        assertEquals(15.0, resultado);
    }

    @Test
    void calcular_con_peso_en_cero() {
        ImplCalculoEnvio envioLocal = new EnvioLocal();
        double resultado = envioLocal.calcular(0.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void calcular_con_peso_negativo() {
        ImplCalculoEnvio envioLocal = new EnvioLocal();
        double resultado = envioLocal.calcular(-5.0);
        assertEquals(-7.5, resultado);
    }

}