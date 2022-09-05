package student_aleksandrs_korsaks.ak_lesson_13.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorTest {

    TaxCalculator taxCalculator;

    @BeforeEach
    void setUp() {
        taxCalculator = new TaxCalculator();
    }

    @Test
    void shouldPayZeroTaxWhenIncomeIsZero() {
        var testIncome = BigDecimal.ZERO;
        var expectedTaxResult = new BigDecimal("0.00");
        assertEquals(expectedTaxResult, taxCalculator.taxCalculation(testIncome));
    }

    @Test
    void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var testIncome = BigDecimal.valueOf(19999);
        var expectedTaxResult = BigDecimal.valueOf(4999.75);
        assertEquals(expectedTaxResult, taxCalculator.taxCalculation(testIncome));
    }

    @Test
    void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var testIncome = BigDecimal.valueOf(20000);
        var expectedTaxResult = new BigDecimal("5000.00");
        assertEquals(expectedTaxResult, taxCalculator.taxCalculation(testIncome));
    }

    @Test
    void shouldPay40PercentTaxWhenIncomeMoreThan20000() {
        var testIncome = BigDecimal.valueOf(20001);
        var expectedTaxResult = new BigDecimal("5000.40");
        assertEquals(expectedTaxResult, taxCalculator.taxCalculation(testIncome));
    }

    @Test
    void shouldThrowExceptionWhenIncomeAreNegative() {
        var testIncome = BigDecimal.valueOf(-1);
        assertThrows(NegativeIncomeException.class, () -> taxCalculator.taxCalculation(testIncome));
    }

}