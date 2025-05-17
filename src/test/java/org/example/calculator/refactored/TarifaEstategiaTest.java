package org.example.calculator.refactored;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarifaEstategiaTest {

    TarifaEstategia tfEstrategia;
    double peso;

    @BeforeEach
    void setUp() {
        peso = 100.0;
    }

    @Test
    void calcularTarifaLocal_sobre1_5() {
        tfEstrategia = new TarifaLocal();
        Assertions.assertEquals(150.0, tfEstrategia.calcular(peso));
    }

    @Test
    void calcularTarifaInternacional_sobre2_0() {
        tfEstrategia = new TarifaInternacional();
        Assertions.assertEquals(200.0, tfEstrategia.calcular(peso));
    }
}