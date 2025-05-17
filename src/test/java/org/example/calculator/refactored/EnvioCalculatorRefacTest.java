package org.example.calculator.refactored;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class EnvioCalculatorRefacTest {

    private TarifaEstategia tfMock;
    private EnvioCalculatorRefac envioCalculatorRefac;
    double pesoValido;
    double pesoInvalido;

    @BeforeEach
    void setUp() {
        tfMock = Mockito.mock(TarifaEstategia.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(tfMock);
        pesoValido = 100.0;
        pesoInvalido = -100.0;
    }

    @Test
    void calcularEnvioLocal_Exitoso() {
        Mockito.when(tfMock.calcular(pesoValido)).thenReturn(15.0);
        double costoEnvio = envioCalculatorRefac.CalcularEnvio(pesoValido);
        Assertions.assertEquals(15.0, costoEnvio);
        Mockito.verify(tfMock, Mockito.times(1)).calcular(pesoValido);
    }

    @Test
    void calcularEnvioInternacional_Exitoso() {
        Mockito.when(tfMock.calcular(pesoValido)).thenReturn(20.0);
        double costoEnvio = envioCalculatorRefac.CalcularEnvio(pesoValido);
        Assertions.assertEquals(20.0, costoEnvio);
        Mockito.verify(tfMock, Mockito.times(1)).calcular(pesoValido);
    }

    @Test
    void calcularEnvioPesoInvalido_Fallido() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> envioCalculatorRefac.CalcularEnvio(pesoInvalido));
        Mockito.verify(tfMock, Mockito.never()).calcular(pesoInvalido);
    }
}