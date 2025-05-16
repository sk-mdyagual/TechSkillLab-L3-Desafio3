package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class EnvioCalculatorRefacTest {

    @Mock
    private ICalcular iCalcular;
    @InjectMocks
    private EnvioCalculatorRefac envioCalculatorRefac;

    double peso;

    @BeforeEach
    void setUp() {
        peso = 10.0;
    }

    @Test
    void calcularEnvioLocalRetornaCostoTotal() {

        Mockito.when(iCalcular.calcular(peso)).thenReturn(15.0);

        double result = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(15.0, result);
        Mockito.verify(iCalcular, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcularEnvioInternacionalRetornaCostoTotal() {

        Mockito.when(iCalcular.calcular(peso)).thenReturn(30.0);

        double result = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(30.0, result);
        Mockito.verify(iCalcular, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcularEnvioNacionalRetornaCostoTotal() {

        Mockito.when(iCalcular.calcular(peso)).thenReturn(20.0);

        double result = envioCalculatorRefac.calcularEnvio(10.0);

        assertEquals(20.0, result);
        Mockito.verify(iCalcular, Mockito.times(1)).calcular(peso);
    }

    @Test
    void calcularEnvioPesoCeroRetornaCostoTotalCero(){

        peso = 0;
        double result = envioCalculatorRefac.calcularEnvio(peso);

        assertEquals(0, result);
        Mockito.verify(iCalcular, Mockito.times(0)).calcular(peso);
    }
}