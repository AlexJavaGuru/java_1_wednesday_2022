package teacher.lesson_13_junit.lessoncode;

public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public double calculateTax(int input) {
        return input * 0.25;
    }

}
