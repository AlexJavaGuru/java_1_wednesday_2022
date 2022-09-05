package student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules;

import student_aleksandrs_korsaks.ak_lesson_13.level_1.NegativeIncomeException;
import student_aleksandrs_korsaks.ak_lesson_13.level_1.TaxCalculatorRule;

import java.math.BigDecimal;

public class IncomeNegative implements TaxCalculatorRule {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        throw new NegativeIncomeException("Incomes should be positive");
    }
}
