package org.example.calculator.refactored.envios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefacTest {

    private EnvioEstrategia envioEstrategia;
    private EnvioCalculatorRefac envioCalculatorRefac;
    double peso;

    @BeforeEach
    void setUp() {
        envioEstrategia = Mockito.mock(EnvioEstrategia.class);
        envioCalculatorRefac = new EnvioCalculatorRefac(envioEstrategia);
        peso = 100.0;
    }

    @Test
    void calcularEnvioInternacional() {
        Mockito.when(envioEstrategia.calcularEnvio(peso)).thenReturn(300.0);
        double total = envioCalculatorRefac.calcularEnvio(peso);
        assertEquals(300, total);
        Mockito.verify(envioEstrategia, Mockito.times(1)).calcularEnvio(peso);
    }
}