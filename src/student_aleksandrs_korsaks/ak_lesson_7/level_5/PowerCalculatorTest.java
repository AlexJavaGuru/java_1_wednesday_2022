package student_aleksandrs_korsaks.ak_lesson_7.level_5;

class PowerCalculatorTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.isUserInputValidWhenNumberZeroExponentLessThanZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberZeroExponentZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberZeroExponentGreaterThanZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberLessThanZeroExponentZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberGreaterThanZeroExponentZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest1();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest2();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberGreaterThanZeroExponentLessThanZeroTest();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest1();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest2();
        powerCalculatorTest.exponentiateNumberCaseWhenNumberGreaterThanZeroExponentGreaterThanZeroTest();

    }

    public void isUserInputValidWhenNumberZeroExponentLessThanZeroTest() {
        boolean realResult = powerCalculator.isUserInputValid(0, -1);
        checkTestResult("sUserInputValidWhenNumberZeroExponentLessThanZeroTest", !realResult);
    }

    public void exponentiateNumberCaseWhenNumberZeroExponentZeroTest() {
        double expectedResult = 1;
        double realResult = powerCalculator.exponentiateNumberCase(0, 0);
        checkTestResult("exponentiateNumberCaseWhenNumberZeroExponentZeroTest", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberZeroExponentGreaterThanZeroTest() {
        double expectedResult = 0;
        double realResult = powerCalculator.exponentiateNumberCase(0, 3);
        checkTestResult("exponentiateNumberCaseWhenNumberZeroExponentGreaterThanZeroTest", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberLessThanZeroExponentZeroTest() {
        double expectedResult = 1;
        double realResult = powerCalculator.exponentiateNumberCase(-2, 0);
        checkTestResult("exponentiateNumberCaseWhenNumberLessThanZeroExponentZeroTest", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberGreaterThanZeroExponentZeroTest() {
        double expectedResult = 1;
        double realResult = powerCalculator.exponentiateNumberCase(2, 0);
        checkTestResult("exponentiateNumberCaseWhenNumberGreaterThanZeroExponentZeroTest", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest1() {
        double expectedResult = 0.25;
        double realResult = powerCalculator.exponentiateNumberCase(-2, -2);
        checkTestResult("exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest1", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest2() {
        double expectedResult = -0.125;
        double realResult = powerCalculator.exponentiateNumberCase(-2, -3);
        checkTestResult("exponentiateNumberCaseWhenNumberAndExponentLessThanZeroTest2", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberGreaterThanZeroExponentLessThanZeroTest() {
        double expectedResult = 0.25;
        double realResult = powerCalculator.exponentiateNumberCase(2, -2);
        checkTestResult("exponentiateNumberCaseWhenNumberGreaterThanZeroExponentLessThanZeroTest", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest1() {
        double expectedResult = 81;
        double realResult = powerCalculator.exponentiateNumberCase(-3, 4);
        checkTestResult("exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest1", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest2() {
        double expectedResult = -27;
        double realResult = powerCalculator.exponentiateNumberCase(-3, 3);
        checkTestResult("exponentiateNumberCaseWhenNumberLessThanZeroExponentGreaterThanZeroTest2", expectedResult == realResult);
    }

    public void exponentiateNumberCaseWhenNumberGreaterThanZeroExponentGreaterThanZeroTest() {
        double expectedResult = 27;
        double realResult = powerCalculator.exponentiateNumberCase(3, 3);
        checkTestResult("exponentiateNumberCaseWhenNumberGreaterThanZeroExponentGreaterThanZeroTest", expectedResult == realResult);
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
