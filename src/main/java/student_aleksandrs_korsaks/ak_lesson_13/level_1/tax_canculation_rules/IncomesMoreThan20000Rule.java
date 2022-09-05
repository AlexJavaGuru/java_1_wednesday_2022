package student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules;

import student_aleksandrs_korsaks.ak_lesson_13.level_1.TaxCalculatorRule;

import java.math.BigDecimal;

public class IncomesMoreThan20000Rule implements TaxCalculatorRule {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {

        return income.subtract(BigDecimal.valueOf(20000))
                .multiply(BigDecimal.valueOf(0.4))
                .add(BigDecimal.valueOf(20000)
                .multiply(BigDecimal.valueOf(0.25)));

    }
}
