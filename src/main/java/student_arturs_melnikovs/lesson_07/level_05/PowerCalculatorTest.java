package student_arturs_melnikovs.lesson_07.level_05;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest tester = new PowerCalculatorTest();
        tester.testRaiseToPositive();
        tester.testRaiseToZero();
        tester.testRaiseToNegative();
    }

    public void testRaiseToPositive() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 27;
        double actualResult = calculator.raiseToPower(0, -1);
        checkResult(expectedResult, actualResult, "Raise to positive test");
    }
    public void testRaiseToZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 1;
        double actualResult = calculator.raiseToPower(5, 0);
        checkResult(expectedResult, actualResult, "Raise to zero test");
    }
    public void testRaiseToNegative() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = 1.0 / 27.0;
        double actualResult = calculator.raiseToPower(3, -3);
        checkResult(expectedResult, actualResult, "Raise to negative test");
    }

    private void checkResult(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
