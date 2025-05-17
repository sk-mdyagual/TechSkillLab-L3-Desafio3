package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefactTest {
    @Mock
    private ZonaDeEnvio zonaMock;

    @InjectMocks
    private EnvioCalculatorRefact envioCalculatorMockeado;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testConMockito_DeberiaRetornarCostoSimulado() {
        double peso = 10.0;
        Mockito.when(zonaMock.calcularCosto(peso)).thenReturn(50.0);

        double resultado = envioCalculatorMockeado.calcularElEnvio(peso);

        assertEquals(50.0, resultado);
        Mockito.verify(zonaMock, Mockito.times(1)).calcularCosto(peso);
    }

    @Test
    void testConMockito_PesoInvalido_LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> envioCalculatorMockeado.calcularElEnvio(0));
        Mockito.verify(zonaMock, Mockito.never()).calcularCosto(Mockito.anyDouble());
    }

    @Test
    void testZonaLocal_CalculoCorrecto() {
        ZonaDeEnvio zonaLocal = new Local();
        EnvioCalculatorRefact calculator = new EnvioCalculatorRefact(zonaLocal);

        double resultado = calculator.calcularElEnvio(4.0);

        assertEquals(6.0, resultado);
    }

    @Test
    void testZonaNacional_CalculoCorrecto() {
        ZonaDeEnvio zonaNacional = new Nacional();
        EnvioCalculatorRefact calculator = new EnvioCalculatorRefact(zonaNacional);

        double resultado = calculator.calcularElEnvio(4.0);

        assertEquals(8.0, resultado);
    }

    @Test
    void testZonaInternacional_CalculoCorrecto() {
        ZonaDeEnvio zonaInternacional = new Internacional();
        EnvioCalculatorRefact calculator = new EnvioCalculatorRefact(zonaInternacional);

        double resultado = calculator.calcularElEnvio(4.0);

        assertEquals(12.0, resultado);
    }

    @Test
    void testZonaInternacional_PesoDecimal() {
        ZonaDeEnvio zonaInternacional = new Internacional();
        EnvioCalculatorRefact calculator = new EnvioCalculatorRefact(zonaInternacional);

        double resultado = calculator.calcularElEnvio(2.5);

        assertEquals(7.5, resultado);
    }

    @Test
    void testZonaLocal_PesoNegativo_LanzaExcepcion() {
        ZonaDeEnvio zonaLocal = new Local();
        EnvioCalculatorRefact calculator = new EnvioCalculatorRefact(zonaLocal);

        assertThrows(IllegalArgumentException.class, () -> calculator.calcularElEnvio(-1));
    }
}
