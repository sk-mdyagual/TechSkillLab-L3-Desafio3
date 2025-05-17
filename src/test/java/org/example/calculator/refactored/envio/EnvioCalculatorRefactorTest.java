package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class EnvioCalculatorRefactorTest {
    @Mock
    private EnvioEstrategia envioMock;
    @InjectMocks
    private EnvioCalculatorRefactor envioCalculatorRefactor;


    double peso;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        peso = 100.0;
    }

    @Test
    void calcularTotalConEnvio_debeCalcular250() {
        Mockito.when(envioMock.calcular(peso)).thenReturn(150.0);
        double total = envioCalculatorRefactor.calcularTotal(peso);
        assertEquals(250, total);
    }
}