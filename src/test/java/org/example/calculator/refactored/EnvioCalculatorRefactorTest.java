package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefactorTest {

    private EnvioEstrategia envioMock;
    private EnvioCalculatorRefactor envioCalculatorRefactor;
    double peso;
    double pesoInvalido;

    @BeforeEach
    void setUp() {
        envioMock = Mockito.mock(EnvioEstrategia.class);
        envioCalculatorRefactor = new EnvioCalculatorRefactor(envioMock);
        peso = 10.0; // Peso de ejemplo para las pruebas
        pesoInvalido = -5.0; // Peso inválido para las pruebas
    }

    @Test
    void testCalcularEnvioLocal() {
        Mockito.when(envioMock.calcularEnvio(peso)).thenReturn(10.0);
        double resultado = envioCalculatorRefactor.calcularEnvio(peso);
        assertEquals(10.0, resultado);
        Mockito.verify(envioMock, Mockito.times(1)).calcularEnvio(peso);
    }

    @Test
    void testCalcularEnvioNacional() {
        Mockito.when(envioMock.calcularEnvio(peso)).thenReturn(20.0);
        double resultado = envioCalculatorRefactor.calcularEnvio(peso);
        assertEquals(20.0, resultado);
        Mockito.verify(envioMock, Mockito.times(1)).calcularEnvio(peso);
    }

    @Test
    void testCalcularEnvioInternacional() {
        Mockito.when(envioMock.calcularEnvio(peso)).thenReturn(30.0);
        double resultado = envioCalculatorRefactor.calcularEnvio(peso);
        assertEquals(30.0, resultado);
        Mockito.verify(envioMock, Mockito.times(1)).calcularEnvio(peso);
    }

    @Test
    void testCalcularEnvioPesoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            envioCalculatorRefactor.calcularEnvio(pesoInvalido);
        });
    }
}