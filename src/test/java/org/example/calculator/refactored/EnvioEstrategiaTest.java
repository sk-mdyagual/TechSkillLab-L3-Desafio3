package org.example.calculator.refactored;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioEstrategiaTest {

    private EnvioEstrategia envioEstrategia;
    double peso;

    @BeforeEach
    void setUp() {
        peso = 10.0; // Peso de ejemplo para las pruebas
    }

    @Test
    void calcularEnvioExitosoZonaLocal() {
        envioEstrategia = new EnvioLocal();
        assertEquals(15.0, envioEstrategia.calcularEnvio(peso));
    }

    @Test
    void calcularEnvioExitosoZonaNacional() {
        envioEstrategia = new EnvioNacional();
        assertEquals(20.0, envioEstrategia.calcularEnvio(peso));
    }

    @Test
    void calcularEnvioExitosoZonaInternacional() {
        envioEstrategia = new EnvioInternacional();
        assertEquals(30.0, envioEstrategia.calcularEnvio(peso));
    }
}