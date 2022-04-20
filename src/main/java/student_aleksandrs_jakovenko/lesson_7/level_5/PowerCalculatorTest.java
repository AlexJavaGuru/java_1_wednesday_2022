package student_aleksandrs_jakovenko.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.positivePow();
        test.negativePow();
        test.zeroPow();
    }

    public void checkResult(double actualResult, double expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void positivePow() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2,6);
        double expectedResult = 64;
        checkResult(actualResult, expectedResult, "PositivePow test");
    }

    public void negativePow() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2,-6);
        double expectedResult = 0.015625;
        checkResult(actualResult, expectedResult, "NegativePow test");
    }

    public void zeroPow() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2,0);
        double expectedResult = 1;
        checkResult(actualResult, expectedResult, "ZeroPow test");
    }
}
