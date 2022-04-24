package student_arturs_melnikovs.lesson_13.level_01;

import java.math.BigDecimal;

class CalculationRule1 extends CalculationRule {

    @Override
    BigDecimal calculate(BigDecimal income) {
        return income.multiply(new BigDecimal("0.25"));
    }

}
