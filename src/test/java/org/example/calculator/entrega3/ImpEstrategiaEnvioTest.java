package org.example.calculator.entrega3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpEstrategiaEnvioTest {
    ImpEstrategiaEnvio impEstrategiaEnvio;
    double peso;

    @BeforeEach
    void setUp() {
        peso = 10;
    }

    @Test
    void calculaValorEnvioLocal_debeCalculaTarifa1_5() {
        impEstrategiaEnvio = new ValorEnvioLocal();
        assertEquals(15, impEstrategiaEnvio.calcularEnvio(peso));
    }

    @Test
    void calculaValorEnvioNacional_debeCalculaTarifa2_0() {
        impEstrategiaEnvio = new ValorEnvioNacional();
        assertEquals(20, impEstrategiaEnvio.calcularEnvio(peso));
    }

    @Test
    void calculaValorEnvioInternacionall_debeCalculaTarifa3_0() {
        impEstrategiaEnvio = new ValorEnvioInternacional();
        assertEquals(30, impEstrategiaEnvio.calcularEnvio(peso));
    }
}