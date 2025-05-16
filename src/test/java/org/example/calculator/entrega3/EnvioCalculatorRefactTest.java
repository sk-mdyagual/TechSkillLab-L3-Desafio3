package org.example.calculator.entrega3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefactTest {
    private EstrategiaEnvioFactory estMock;
    private EnvioCalculatorRefact envioCalculatorRefact;
    private double peso;

    @BeforeEach
    void setUp() {
        estMock = Mockito.mock(EstrategiaEnvioFactory.class);
        envioCalculatorRefact = new EnvioCalculatorRefact(estMock);
        peso = 10.0;
    }

    @Test
    void calcularEnvioLocal_retornaMontoTotal() {
        Mockito.when(estMock.obtenerEstrategia("local")).thenReturn(new ValorEnvioLocal());

        double total = envioCalculatorRefact.calcularEnvioTotal(peso, "local");

        assertEquals(15.0, total);

        Mockito.verify(estMock, Mockito.times(1)).obtenerEstrategia("local");
    }

    @Test
    void calcularEnvioNacional_retornaMontoTotal() {
        Mockito.when(estMock.obtenerEstrategia("nacional")).thenReturn(new ValorEnvioNacional());

        double total = envioCalculatorRefact.calcularEnvioTotal(peso, "nacional");

        assertEquals(20.0, total);

        Mockito.verify(estMock, Mockito.times(1)).obtenerEstrategia("nacional");
    }

    @Test
    void calcularEnvioInternacional_retornaMontoTotal() {
        Mockito.when(estMock.obtenerEstrategia("internacional")).thenReturn(new ValorEnvioInternacional());

        double total = envioCalculatorRefact.calcularEnvioTotal(peso, "internacional");

        assertEquals(30.0, total);

        Mockito.verify(estMock, Mockito.times(1)).obtenerEstrategia("internacional");
    }

    @Test
    void calcularEnvioZonaDesconocida_retornaExcepcion() {
        Mockito.when(estMock.obtenerEstrategia("otra")).thenThrow(new IllegalArgumentException("Zona no válida"));

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            envioCalculatorRefact.calcularEnvioTotal(peso, "otra");
        });

        assertEquals("Zona no válida", exception.getMessage());

        Mockito.verify(estMock, Mockito.times(1)).obtenerEstrategia("otra");
    }

}