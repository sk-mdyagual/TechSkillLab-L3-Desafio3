package org.example.calculator.refactored;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplEnvioInternacionalTest {
    private IEnvioStrategy envioStrategy;
    private double pesoPositivo;
    private double pesoCero;
    private double pesoNegativo;

    @BeforeEach
    void setUp() {
        envioStrategy = new ImplEnvioInternacional();
        pesoPositivo = 10.0;
        pesoCero = 0;
        pesoNegativo = -10.0;
    }

    @Test
    void testCalcularConPesoPositivo() {
        double resultado = envioStrategy.calcular(pesoPositivo);

        Assertions.assertEquals(30.0, resultado);
    }

    @Test
    void testCalcularConPesoCero() {
        double resultado = envioStrategy.calcular(pesoCero);

        Assertions.assertEquals(0, resultado);
    }

    @Test
    void testCalcularConPesoNegativo() {
        double resultado = envioStrategy.calcular(pesoNegativo);

        Assertions.assertEquals(0, resultado);
    }
}