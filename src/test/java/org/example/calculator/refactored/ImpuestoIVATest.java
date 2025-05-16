package org.example.calculator.refactored;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ImpuestoIVATest {

    @Test
    void calcular_conMontoPositivo_devuelveIVA() {
        ImpuestoIVA impuesto = new ImpuestoIVA();
        double monto = 100.0;
        double esperado = 100.0 * 15;
        double resultado = impuesto.calcular(monto);
        assertEquals(esperado, resultado, 0.00001);
    }

    @Test
    void calcular_conMontoCero_devuelveCero() {
        ImpuestoIVA impuesto = new ImpuestoIVA();
        double monto = 0.0;
        double esperado = 0.0;
        double resultado = impuesto.calcular(monto);
        assertEquals(esperado, resultado, 0.00001);
    }

    @Test
    void calcular_conMontoNegativo_devuelveIVANegativo() {
        ImpuestoIVA impuesto = new ImpuestoIVA();
        double monto = -50.0;
        double esperado = -50.0 * 15;
        double resultado = impuesto.calcular(monto);
        assertEquals(esperado, resultado, 0.00001);
    }
}