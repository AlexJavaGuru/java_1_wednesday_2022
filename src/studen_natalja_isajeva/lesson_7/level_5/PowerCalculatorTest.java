package studen_natalja_isajeva.lesson_7.level_5;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testCalculateZero();
        test.testCalculatePositive();
        test.testCalculateNegative();

    }

    public void testCalculateZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 1;
        double actualResult = calculator.calculateDegree(6, 0);
        if (expectedResult == actualResult) {
            System.out.println("Test 1 is Passed");
        } else {
            System.out.println("Test 1 is Failed");
        }
    }

    public void testCalculatePositive() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 81;
        double actualResult = calculator.calculateDegree(9, 2);
        if (expectedResult == actualResult) {
            System.out.println("Test 2 is Passed");
        } else {
            System.out.println("Test 2 is Failed");
        }
    }

    public void testCalculateNegative() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 1 / 81.00;
        double actualResult = calculator.calculateDegree(9, -2);
        if (expectedResult == actualResult) {
            System.out.println("Test 3 is Passed");
        } else {
            System.out.println("Test 3 is Failed");
        }
    }
}
