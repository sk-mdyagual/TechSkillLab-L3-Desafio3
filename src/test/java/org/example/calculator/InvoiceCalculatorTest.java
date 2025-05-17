package org.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InvoiceCalculatorTest {

    private final InvoiceCalculator calculator = new InvoiceCalculator();

    @Test
    void testCalculateWithIVA() {
        double result = calculator.calculate(100.0, 1);
        assertEquals(119.0, result, 0.001);
    }

    @Test
    void testCalculateWithRecargo() {
        double result = calculator.calculate(100.0, 2);
        assertEquals(105.0, result, 0.001);
    }

    @Test
    void testCalculateWithOtherType() {
        double result = calculator.calculate(100.0, 3);
        assertEquals(100.0, result, 0.001);
    }

    @Test
    void testCalculateWithNegativeAmount() {
        double result = calculator.calculate(-50.0, 1);
        assertEquals(-59.5, result, 0.001);
    }
}
