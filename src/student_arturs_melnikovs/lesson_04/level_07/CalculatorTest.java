package student_arturs_melnikovs.lesson_04.level_07;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        int firstNumber = 35;
        int secondNumber = 40;
        int expectedResult = 75;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "sumTest");
    }

    public void subTest() {
        int firstNumber = 35;
        int secondNumber = 15;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        int expectedResult = 20;
        checkResult(expectedResult, result, "subTest");
    }

    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        int expectedResult = 25;
        checkResult(expectedResult, result, "mulTest");
    }

    public void divTest() {
        int firstNumber = 40;
        int secondNumber = 8;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        int expectedResult = 5;
        checkResult(expectedResult, result, "divTest");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(40);
        checkResult(result, "isEven1 test");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(41);
        checkResult(!result, "isEven2 test");
    }
    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    public void checkResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
