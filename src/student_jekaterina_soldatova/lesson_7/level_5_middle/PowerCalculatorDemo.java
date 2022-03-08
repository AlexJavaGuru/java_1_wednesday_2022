package student_jekaterina_soldatova.lesson_7.level_5_middle;

class PowerCalculatorDemo {
    public static void main(String[] args) {
        int[] exponent = PowerCalculator.getNumbers();
        if (PowerCalculator.checkPower(exponent)) {
            int result = PowerCalculator.exponentiationPositive(exponent);
            PowerCalculator.printResult(result);
        } else {
            double result = PowerCalculator.exponentiationNegative(exponent);
            PowerCalculator.printResult(result);
        }
    }
}
