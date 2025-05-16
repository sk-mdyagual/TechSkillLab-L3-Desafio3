package org.example.calculator.refactored;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class EnvioCalculatorRefacTest {
    private double pesoMock;

    @Mock
    private IEnvioStrategy envioStrategy;

    @InjectMocks
    private EnvioCalculatorRefac envioCalculatorRefac;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        envioStrategy = Mockito.mock(IEnvioStrategy.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(envioStrategy);
        pesoMock = 10.0;
    }

    @Test
    void testCalcularEnvioConValorValido() {
        Mockito.when(envioStrategy.calcular(pesoMock)).thenReturn(15.0);

        double valorEnvioCalculado = envioCalculatorRefac.calcularEnvio(pesoMock);

        Assertions.assertEquals(15.0,  valorEnvioCalculado);

        Mockito.verify(envioStrategy, Mockito.times(1)).calcular(pesoMock);
    }

    @Test
    void testRetornarExcepcionConValorCero() {
        double valorEnvioCalculado = envioCalculatorRefac.calcularEnvio(0);

        Assertions.assertEquals(0,  valorEnvioCalculado);

        Mockito.verify(envioStrategy, Mockito.never()).calcular(pesoMock);
    }

    @Test
    void testRetornarExcepcionConValorNegativo() {
        double valorEnvioCalculado = envioCalculatorRefac.calcularEnvio(-10.0);

        Assertions.assertEquals(0,  valorEnvioCalculado);

        Mockito.verify(envioStrategy, Mockito.never()).calcular(pesoMock);
    }
}