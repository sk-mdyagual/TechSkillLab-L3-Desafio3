package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    private ImpEstrategia impMock;
    private EnvioCalculatorRefac envioCalculatorRefac;
    double amount;

    @BeforeEach
    void setUp() {
        impMock = Mockito.mock(ImpEstrategia.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(impMock);
        amount = 100.0;
    }

    @Test
    void calcularTotalEnvioLocal() {
        Mockito.when(impMock.calcular(amount)).thenReturn(10.0);

        double total = envioCalculatorRefac.calcularTotal(amount);

        assertEquals(110.0, total);

        Mockito.verify(impMock, Mockito.times(1)).calcular(amount);
    }

    @Test
    void calcularTotalEnvioInternacional() {
        Mockito.when(impMock.calcular(amount)).thenReturn(20.0);

        double total = envioCalculatorRefac.calcularTotal(amount);

        assertEquals(120.0, total);

        Mockito.verify(impMock, Mockito.times(1)).calcular(amount);
    }

    @Test
    void calcularTotal_PesoInvalido_DevuelveCero() {
        double pesoInvalido = -5.0;

        double total = envioCalculatorRefac.calcularTotal(pesoInvalido);

        assertEquals(0.0, total);

        Mockito.verify(impMock, Mockito.never()).calcular(Mockito.anyDouble());
    }



}