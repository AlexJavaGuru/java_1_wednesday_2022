package student_andrejs_saldavs.lesson_04.level_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEven();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTestOne();
        calculatorTest.maxOfThreeNumbersTestTwo();
        calculatorTest.maxOfThreeNumbersTestThree();
        calculatorTest.maxOfThreeNumbersTestFour();
        calculatorTest.maxOfThreeNumbersTestFive();
        calculatorTest.maxOfThreeNumbersTestSix();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void isEven() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(4);
        if (realResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }
    }

    public void maxOfTwoNumbersTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has failed");
        }

    }

    public void maxOfThreeNumbersTestOne() {
        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = 4;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 1 has passed");
        } else {
            System.out.println("Test 1 has failed");
        }
    }

    public void maxOfThreeNumbersTestTwo() {
        int firstNumber = 5;
        int secondNumber =10;
        int thirdNumber = 4;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 2 has passed");
        } else {
            System.out.println("Test 2 has failed");
        }
    }

    public void maxOfThreeNumbersTestThree() {
        int firstNumber = 4;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 3 has passed");
        } else {
            System.out.println("Test 3 has failed");
        }
    }

    public void maxOfThreeNumbersTestFour() {
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 4;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 4 has passed");
        } else {
            System.out.println("Test 4 has failed");
        }
    }

    public void maxOfThreeNumbersTestFive() {
        int firstNumber = 4;
        int secondNumber = 2;
        int thirdNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 5 has passed");
        } else {
            System.out.println("Test 5 has failed");
        }
    }

    public void maxOfThreeNumbersTestSix() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Test 6 has passed");
        } else {
            System.out.println("Test 6 has failed");
        }
    }

}
