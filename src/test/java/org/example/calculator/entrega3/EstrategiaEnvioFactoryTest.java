package org.example.calculator.entrega3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstrategiaEnvioFactoryTest {

    private final EstrategiaEnvioFactory factory = new EstrategiaEnvioFactory();

    @Test
    public void testObtenerEstrategiaLocal() {
        ImpEstrategiaEnvio estrategia = factory.obtenerEstrategia("local");
        assertTrue(estrategia instanceof ValorEnvioLocal);
    }

    @Test
    public void testObtenerEstrategiaNacional() {
        ImpEstrategiaEnvio estrategia = factory.obtenerEstrategia("nacional");
        assertTrue(estrategia instanceof ValorEnvioNacional);
    }

    @Test
    public void testObtenerEstrategiaInternacional() {
        ImpEstrategiaEnvio estrategia = factory.obtenerEstrategia("internacional");
        assertTrue(estrategia instanceof ValorEnvioInternacional);
    }

    @Test
    public void testZonaNoValidaLanzaExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            factory.obtenerEstrategia("espacial");
        });
        assertEquals("Zona no válida", exception.getMessage());
    }
}

