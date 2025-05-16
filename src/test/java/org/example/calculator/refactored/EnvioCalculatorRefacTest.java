package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    private ImplCalculoEnvio impMock;
    private EnvioCalculatorRefac envioCalculatorRefac;
    private final double peso = 10.0;

    @BeforeEach
    void setUp() {
        impMock = Mockito.mock(ImplCalculoEnvio.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(impMock);
    }

    @Test
    void calcular_envio_local() {
        Mockito.when(impMock.calcular(peso)).thenReturn(15.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso, "local");
        assertEquals(15.0, resultado);
        Mockito.verify(impMock, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcular_envio_nacional() {
        Mockito.when(impMock.calcular(peso)).thenReturn(20.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso, "nacional");
        assertEquals(20.0, resultado);
        Mockito.verify(impMock, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcular_envio_internacional() {
        Mockito.when(impMock.calcular(peso)).thenReturn(30.0);
        double resultado = envioCalculatorRefac.calcularEnvio(peso, "internacional");
        assertEquals(30.0, resultado);
        Mockito.verify(impMock, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcular_envio_con_zona_vacia() {
        double resultado = envioCalculatorRefac.calcularEnvio(peso, "");
        assertEquals(0.0, resultado);
        Mockito.verify(impMock, Mockito.never()).calcular(Mockito.anyDouble());
    }

    @Test
    void calcular_envio_con_zona_nula() {
        double resultado = envioCalculatorRefac.calcularEnvio(peso, null);
        assertEquals(0.0, resultado);
        Mockito.verify(impMock, Mockito.never()).calcular(Mockito.anyDouble());
    }

    @Test
    void calcular_envio_con_valor_negativo() {
        double resultado = envioCalculatorRefac.calcularEnvio(-10, "local");
        assertEquals(0.0, resultado);
        Mockito.verify(impMock, Mockito.never()).calcular(Mockito.anyDouble());
    }

}