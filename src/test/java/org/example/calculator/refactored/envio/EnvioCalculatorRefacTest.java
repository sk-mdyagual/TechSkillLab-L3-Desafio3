package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    private ImpZona zonaMock;
    private EnvioCalculatorRefac envioCalculatorRefac;
    private double peso;

    @BeforeEach
    void setUp() {
        zonaMock = Mockito.mock(ImpZona.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(zonaMock);
        peso = 10.0;
    }

    @Test
    void calcularEnvioConPesoNegativoLanzaExcepcion() {
        peso = -5.0;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            envioCalculatorRefac.calcularEnvio(peso);
        });
        assertEquals("El peso debe ser mayor que cero", exception.getMessage());
    }

    @Test
    void calcularEnvioAZonaLocalRetornaMultiplicacionMontoYValorEnvio() {
        Mockito.when(zonaMock.calcularEnvio(peso)).thenReturn(15.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso);
        assertEquals(15.0, resultado);
    }

    @Test
    void calcularEnvioAZonaNacionalRetornaMultiplicacionMontoYValorEnvio() {
        Mockito.when(zonaMock.calcularEnvio(peso)).thenReturn(25.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso);
        assertEquals(25.0, resultado);
    }

    @Test
    void calcularEnvioAZonaInternacionalRetornaMultiplicacionMontoYValorEnvio() {
        Mockito.when(zonaMock.calcularEnvio(peso)).thenReturn(50.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso);
        assertEquals(50.0, resultado);
    }
}