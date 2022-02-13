package student_aleksandrs_korsaks.ak_lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenFirstTest();
        calculatorTest.isEvenSecondTest();
    }

    public void sumTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        checkTestResult("sumTest", expectedResult, realResult);
    }

    public void subTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        checkTestResult("subTest", expectedResult, realResult);
    }

    public void mulTest() {
        int firstNumber = 20;
        int secondNumber = 10;
        int expectedResult = 200;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        checkTestResult("mulTest", expectedResult, realResult);
    }

    public void divTest() {
        int firstNumber = 20;
        int secondNumber = 15;
        double expectedResult = 1.33;
        Calculator calculator = new Calculator();
        double realResult = calculator.div(firstNumber, secondNumber);
        checkTestResult("divTest", expectedResult, realResult);
    }

    public void isEvenFirstTest() {
        int firstNumber = 20;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);
        checkTestResult("isEvenFirstTest", realResult);
    }

    public void isEvenSecondTest() {
        int firstNumber = 19;
        Calculator calculator = new Calculator();
        boolean realResult = !(calculator.isEven(firstNumber));
        checkTestResult("isEvenSecondTest", realResult);
    }

    public void checkTestResult(String testName, int expectedResult, int realResult) {
        if (realResult == expectedResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }

    public void checkTestResult(String testName, double expectedResult, double realResult) {
        if (realResult == expectedResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }

    public void checkTestResult(String testName, boolean realResult) {
        if (realResult) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
