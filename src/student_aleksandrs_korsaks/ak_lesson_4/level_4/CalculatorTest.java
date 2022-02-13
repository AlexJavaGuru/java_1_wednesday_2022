package student_aleksandrs_korsaks.ak_lesson_4.level_4;

public class CalculatorTest {
    double expectedResult;
    double realResult;

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
    }

    public void sumTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        expectedResult = 30;
        Calculator calculator = new Calculator();
        realResult = calculator.sum(firstNumber, secondNumber);
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        checkTestResult(methodName);
    }

    public void subTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        expectedResult = 10;
        Calculator calculator = new Calculator();
        realResult = calculator.sub(firstNumber, secondNumber);
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        checkTestResult(methodName);
    }

    public void mulTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        expectedResult = 200;
        Calculator calculator = new Calculator();
        realResult = calculator.mul(firstNumber, secondNumber);
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        checkTestResult(methodName);
    }

    public void divTest() {
        int firstNumber = 20;
        int secondNumber = 15;
        expectedResult = 1.33;
        Calculator calculator = new Calculator();
        realResult = calculator.div(firstNumber, secondNumber);
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        checkTestResult(methodName);
    }

    public void checkTestResult(String testName) {
        if (realResult == expectedResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
