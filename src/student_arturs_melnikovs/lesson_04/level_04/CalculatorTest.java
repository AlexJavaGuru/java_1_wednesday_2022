package student_arturs_melnikovs.lesson_04.level_04;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();

        test.sumTest();
        test.testSubtraction();
        test.testMultiplication();
        test.testDivision();
        test.testIfEven();
        test.testMaxOfTwoNumIsFirst();
        test.testMaxOfTwoNumIsSecond();
        test.testMaxOfTwoNumbersEqual();
        test.testMaxOfThreeNumIsFirst();
        test.testMaxOfThreeNumIsSecond();
        test.testMaxOfThreeNumIsThird();
        test.testMaxOfThreeNumIsFirstAndSecond();
        test.testMaxOfThreeNumIsFirstAndThird();
        test.testMaxOfThreeNumIsSecondAndThird();
        test.testMaxOfThreeNumEqual();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "Summation test");
    }

    public void testSubtraction() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int actualResult = calculator.subtract(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "Subtraction test");
    }

    public void testMultiplication() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int actualResult = calculator.multiply(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "Multiplication test");
    }

    public void testDivision() {
        double firstNumber = 5;
        double secondNumber = 2;
        double expectedResult = 2.5;
        Calculator calculator = new Calculator();
        double actualResult = calculator.division(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "Division test");
    }

    public void testIfEven() {
        int even = 4;
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.ifEven(even);
        checkResult(actualResult, "IfEven test");

    }

    public void testMaxOfTwoNumIsFirst() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumIsFirst test");
    }

    public void testMaxOfTwoNumIsSecond() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 100;
        int expectedResult = 100;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumIsSecond test");
    }

    public void testMaxOfTwoNumbersEqual() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        checkResult(expectedResult, actualResult, "MaxOfTwoNumbersEqual test");
    }

    public void testMaxOfThreeNumIsFirst() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 10;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsFirst test");
    }

    public void testMaxOfThreeNumIsSecond() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 15;
        int thirdNumber = 1;
        int expectedResult = 15;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsSecond test");
    }

    public void testMaxOfThreeNumIsThird() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 100;
        int expectedResult = 100;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsThird test");
    }

    public void testMaxOfThreeNumIsFirstAndSecond() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 1;
        int expectedResult = 10;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsFirstAndSecond test");
    }

    public void testMaxOfThreeNumIsFirstAndThird() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 1;
        int thirdNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsFirstAndThird test");
    }

    public void testMaxOfThreeNumIsSecondAndThird() {
        Calculator calculator = new Calculator();
        int firstNumber = 1;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumIsSecondAndThird test");
    }

    public void testMaxOfThreeNumEqual() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        int actualResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        checkResult(expectedResult, actualResult, "MaxOfThreeNumEqual test");
    }

    public void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed...");
            System.out.println("Expected result was: " + true + " but actual is: " + actualResult);
        }
    }
}
