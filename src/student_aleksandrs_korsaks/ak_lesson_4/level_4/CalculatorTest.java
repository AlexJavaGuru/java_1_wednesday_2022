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
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();
        calculatorTest.maxOfThreeNumbersTest8();
        calculatorTest.maxOfThreeNumbersTest9();
        calculatorTest.maxOfThreeNumbersTest10();
        calculatorTest.maxOfThreeNumbersTest11();
        calculatorTest.maxOfThreeNumbersTest12();
        calculatorTest.maxOfThreeNumbersTest13();
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


    public void maxOfTwoNumbersTest1() {
        int firstNumber = 20;
        int secondNumber = 15;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult("maxOfTwoNumbersTest1", expectedResult, realResult);
    }

    public void maxOfTwoNumbersTest2() {
        int firstNumber = 15;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult("maxOfTwoNumbersTest2", expectedResult, realResult);
    }

    public void maxOfTwoNumbersTest3() {
        int firstNumber = 20;
        int secondNumber = 20;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkTestResult("maxOfTwoNumbersTest3", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest1() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest1", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest2() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest2", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest3() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest3", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest4() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest4", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest5() {
        int firstNumber = 3;
        int secondNumber = 1;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest5", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest6() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest6", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest7() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest7", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest8() {
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 2;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest8", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest9() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest9", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest10() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest10", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest11() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest11", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest12() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest12", expectedResult, realResult);
    }

    public void maxOfThreeNumbersTest13() {
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkTestResult("maxOfThreeNumbersTest13", expectedResult, realResult);
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
