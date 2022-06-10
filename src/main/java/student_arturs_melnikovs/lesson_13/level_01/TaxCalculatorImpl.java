package student_arturs_melnikovs.lesson_13.level_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class TaxCalculatorImpl implements TaxCalculator {


    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.intValue() <= 20000) {
            return new CalculationRule1().calculate(income);
        } else {
            return new CalculationRule2().calculate(income);
        }
    }

}
