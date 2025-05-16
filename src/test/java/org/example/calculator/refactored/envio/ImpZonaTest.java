package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpZonaTest {

    ImpZona impZona;
    double peso;

    @BeforeEach
    void setUp() {
        peso = 10.0;
    }

    @Test
    void calcularEnvioZonaLocalDebeSer15() {
        impZona = new ZonaLocal();
        double resultado = impZona.calcularEnvio(peso);
        assertEquals(15.0, resultado);
    }

    @Test
    void calcularEnvioZonaNacionalDebeSer25() {
        impZona = new ZonaNacional();
        double resultado = impZona.calcularEnvio(peso);
        assertEquals(25.0, resultado);
    }

    @Test
    void calcularEnvioZonaInternacionalDebeSer50() {
        impZona = new ZonaInternacional();
        double resultado = impZona.calcularEnvio(peso);
        assertEquals(50.0, resultado);
    }
}