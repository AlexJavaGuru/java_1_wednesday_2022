package student_arturs_melnikovs.lesson_13.level_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator;

    @BeforeEach
    void setUp() {
        taxCalculator = new TaxCalculatorImpl();
    }

    @Test
    public void testShouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("0.00"), taxToPay);
    }

    @Test
    public void testShouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("2500.00"), taxToPay);
    }

    @Test
    public void testShouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("5000.00"), taxToPay);
    }

    @Test
    public void testShouldPay40PercentTaxWHenIncomeBiggerThan20000() {
        var income = new BigDecimal(21000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("5400.00"), taxToPay);
    }
    @Test
    public void testShouldPay40PercentTaxWHenIncomeIs30000() {
        var income = new BigDecimal(30000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("9000.00"), taxToPay);
    }

}