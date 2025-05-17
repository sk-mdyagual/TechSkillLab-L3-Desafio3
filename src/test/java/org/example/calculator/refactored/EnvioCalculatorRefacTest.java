package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    ImpEnvioEstrategia impEstrategiaMock;
    EnvioCalculatorRefac envioCalculatorRefac;
    double peso;

    @BeforeEach
    void setUp() {
        impEstrategiaMock = org.mockito.Mockito.mock(ImpEnvioEstrategia.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);
        peso = 10.0;
    }

    @Test
    void calcularEnvio_totalPagarEnvioLocal() {

        Mockito.when(impEstrategiaMock.calcular(peso)).thenReturn(1.5);

        double total = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(15.0, total);

        Mockito.verify(impEstrategiaMock, Mockito.times(1)).calcular(peso);

    }

    @Test
    void calcularEnvio_totalPagarEnvioNacional() {

        Mockito.when(impEstrategiaMock.calcular(peso)).thenReturn(2.0);

        double total = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(20.0, total);

        Mockito.verify(impEstrategiaMock, Mockito.times(1)).calcular(peso);

    }

    @Test
    void calcularEnvio_totalPagarEnvioInternacional() {

        Mockito.when(impEstrategiaMock.calcular(peso)).thenReturn(3.0);

        double total = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(30.0, total);

        Mockito.verify(impEstrategiaMock, Mockito.times(1)).calcular(peso);

    }

    @Test
    void calcularEnvio_totalPagarEnvioLocalPesoNegativo() {

        peso = -1.0;

        Mockito.when(impEstrategiaMock.calcular(peso)).thenReturn(1.5);

        double total = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(0, total);

    }

    @Test
    void calcularEnvio_totalPagarEnvioLocalExtrategia() {

        impEstrategiaMock = new EnvioInternacional();

        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);

        double total = envioCalculatorRefac.calcularEnvio2(peso);

        assertEquals(30.0, total);

    }

    @Test
    void calcularEnvio_totalPagarEnvioLocalExtrategiaPesoNegativo() {

        peso = -1.0;

        impEstrategiaMock = new EnvioInternacional();

        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);

        double total = envioCalculatorRefac.calcularEnvio2(peso);

        assertEquals(0, total);

    }

    @Test
    void calcularEnvio_totalPagarEnvioNacionalExtrategia() {

        impEstrategiaMock = new EnvioInternacional();

        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);

        double total = envioCalculatorRefac.calcularEnvio2(peso);

        assertEquals(30.0, total);

    }

    @Test
    void calcularEnvio_totalPagarEnvioInternacionalExtrategia() {

        impEstrategiaMock = new EnvioInternacional();

        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);

        double total = envioCalculatorRefac.calcularEnvio2(peso);

        assertEquals(30.0, total);

    }

    @Test
    void calcularEnvio_totalPagarEnvioNullExtrategia() {

        impEstrategiaMock = null;

        envioCalculatorRefac = new EnvioCalculatorRefac(impEstrategiaMock);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            envioCalculatorRefac.calcularEnvio2(peso);
        });

        assertEquals("Estrategia de envío no válida", exception.getMessage());

    }
}