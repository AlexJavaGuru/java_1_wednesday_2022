package student_aleksandrs_korsaks.ak_lesson_13.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {

    TaxCalculatorImpl taxCalculatorImpl;

    @BeforeEach
    void setUp() {
        taxCalculatorImpl = new TaxCalculatorImpl();
    }

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var testValue = BigDecimal.ZERO;
        assertEquals(testValue, taxCalculatorImpl.calculateTax(testValue));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var testIncome = BigDecimal.valueOf(19999);
        var expectedTaxResult = BigDecimal.valueOf(4999.75);
        assertEquals(expectedTaxResult, taxCalculatorImpl.calculateTax(testIncome));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var testIncome = BigDecimal.valueOf(20000);
        var expectedTaxResult = BigDecimal.valueOf(5000);
        assertEquals(expectedTaxResult, taxCalculatorImpl.calculateTax(testIncome));
    }
}