package student_aleksandr_zuk.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();

    }

    public void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void positivePower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2, 3);
        double expectedResult = 8;
        checkResult(actualResult, expectedResult, "Positive power test");
    }

    public void negativePower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2, -3);
        double expectedResult = 0.125;
        checkResult(actualResult, expectedResult, "Negative power test");
    }
    public void zeroPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double actualResult = powerCalculator.numberToPower(2, 0);
        double expectedResult = 1;
        checkResult(actualResult, expectedResult, "Zero power test");
        }
    }


