package org.example.calculator.refactored.envio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnvioEstrategiaTest {
    EnvioEstrategia envioEstrategia;
    double peso;

    @BeforeEach
    void setUp(){
        peso = 100.0;
    }

    @Test
    void calcularEnvioLocal_retorna150() {
        envioEstrategia = new EnvioLocal();
        assertEquals(150.0, envioEstrategia.calcular(peso));
    }

    @Test
    void calcularEnvioNacional_retorna200() {
        envioEstrategia = new EnvioNacional();
        assertEquals(200.0, envioEstrategia.calcular(peso));
    }

    @Test
    void calcularEnvioInternacional_retorna300() {
        envioEstrategia = new EnvioInternacional();
        assertEquals(300.0, envioEstrategia.calcular(peso));
    }
}