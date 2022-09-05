package student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules;

import student_aleksandrs_korsaks.ak_lesson_13.level_1.TaxCalculatorRule;

import java.math.BigDecimal;

public class IncomeLessOrEqual20000Rule implements TaxCalculatorRule {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {

        return income.multiply(BigDecimal.valueOf(0.25));

    }
}
