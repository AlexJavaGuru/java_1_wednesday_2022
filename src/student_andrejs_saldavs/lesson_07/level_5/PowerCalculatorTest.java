package student_andrejs_saldavs.lesson_07.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powTestPositive();
        powerCalculatorTest.powTestZeroPower();
        powerCalculatorTest.powTestZeroNumber();
        powerCalculatorTest.powTestNegative();
    }

    public void powTestPositive() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.powCalculator(2, 3);
        int expectedResult = 8;
        checkResult(expectedResult, actualResult, "Positive pow test");
    }

    public void powTestNegative() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.powCalculator(2, -3);
        double expectedResult = 0.125;
        checkResult(expectedResult, actualResult, "Negative pow test");
    }

    public void powTestZeroPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.powCalculator(15, 0);
        int expectedResult = 15;
        checkResult(expectedResult, actualResult, "Zero power pow test");
    }

    public void powTestZeroNumber() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.powCalculator(0, 10);
        int expectedResult = 0;
        checkResult(expectedResult, actualResult, "Zero number pow test");
    }

    private void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }

    private void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }


}
