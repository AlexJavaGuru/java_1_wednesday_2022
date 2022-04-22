package teacher.lesson_13_junit.lessoncode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator;

    @BeforeEach
    void setUp() {
        taxCalculator = new TaxCalculatorImpl();
    }

    @Test
    void testTaxIsWorking() {
        int input = 20000;
        double actualResult = taxCalculator.calculateTax(input);
        assertEquals(5000, actualResult);
    }
}