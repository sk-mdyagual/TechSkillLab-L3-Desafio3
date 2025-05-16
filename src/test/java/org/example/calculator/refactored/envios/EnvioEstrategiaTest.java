package org.example.calculator.refactored.envios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioEstrategiaTest {

    EnvioEstrategia tipoEnvio;
    double peso;
    double pesoZero;
    double pesoNegativo;

    @BeforeEach
    void setUp() {
        peso = 100.0;
        pesoZero = 0;
        pesoNegativo = -5;
    }

    @Test
    void calcularEnvioLocal() {
        tipoEnvio = new EnvioLocal();
        assertEquals(150.0, tipoEnvio.calcularEnvio(peso));
    }

    @Test
    void calcularEnvioLocalSinPeso() {
        tipoEnvio = new EnvioLocal();
        assertEquals(0, tipoEnvio.calcularEnvio(pesoZero));
    }

    @Test
    void calcularEnvioLocalPesoNegativo() {
        tipoEnvio = new EnvioLocal();
        assertEquals(0, tipoEnvio.calcularEnvio(pesoNegativo));
    }

    @Test
    void calcularEnvioNacional() {
        tipoEnvio = new EnvioNacional();
        assertEquals(200.0, tipoEnvio.calcularEnvio(peso));
    }

    @Test
    void calcularEnvioInternacional() {
        tipoEnvio = new EnvioInternacional();
        assertEquals(300.0, tipoEnvio.calcularEnvio(peso));
    }
}