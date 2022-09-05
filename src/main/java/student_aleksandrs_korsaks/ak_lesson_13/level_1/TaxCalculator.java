package student_aleksandrs_korsaks.ak_lesson_13.level_1;

import student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules.IncomeLessOrEqual20000Rule;
import student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules.IncomeNegative;
import student_aleksandrs_korsaks.ak_lesson_13.level_1.tax_canculation_rules.IncomesMoreThan20000Rule;

import java.math.BigDecimal;

class TaxCalculator {

    TaxCalculatorRule taxCalculator;

    BigDecimal taxCalculation(BigDecimal income) throws NegativeIncomeException {

        if (income.compareTo(BigDecimal.ZERO) < 0) {
            taxCalculator = new IncomeNegative();
        } else if (income.compareTo(BigDecimal.valueOf(20000)) <= 0) {
            taxCalculator = new IncomeLessOrEqual20000Rule();
        } else {
            taxCalculator = new IncomesMoreThan20000Rule();
        }

        return taxCalculator.calculateTax(income);
    }
}

