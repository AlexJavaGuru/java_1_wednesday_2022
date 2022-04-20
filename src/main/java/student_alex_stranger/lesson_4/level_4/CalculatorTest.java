package student_alex_stranger.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstBigger();
        calculatorTest.secondBigger();
        calculatorTest.areEqual();
        calculatorTest.maxOfThreeFirstIsBigger();
        calculatorTest.maxOfThreeSecondIsBigger();
        calculatorTest.maxOfThreeThirdIsBigger();
        calculatorTest.maxOfThreeFirstAndSecondIsBigger();
        calculatorTest.maxOfThreeAreEqual();

    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
    }
    public void firstBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber =5;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(10, 5);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        } else {
            System.out.println("First is bigger test = FAIL");
        }
    }
    public void secondBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(5, 10);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        } else {
            System.out.println("Second is bigger test = FAIL");
        }
    }
    public void areEqual() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(10, 10);
        if (realResult == expectedResult) {
            System.out.println("Equal test = OK");
        } else {
            System.out.println("Equal test = FAIL");
        }
    }
    public void maxOfThreeFirstIsBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 5;
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(10, 8, 5);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        } else {
            System.out.println("First is bigger test = FAIL");
        }
    }
    public void maxOfThreeSecondIsBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 8;
        int secondNumber = 10;
        int thirdNumber = 5;
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(8,10,5);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        } else {
            System.out.println("Second is bigger test = FAIL");
        }
    }
    public void maxOfThreeThirdIsBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 8;
        int secondNumber = 5;
        int thirdNumber = 10;
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(8, 5, 10);
        if (realResult == expectedResult) {
            System.out.println("Third is bigger test = OK");
        } else {
            System.out.println("Third is bigger test = FAIL");
        }
    }
    public void maxOfThreeFirstAndSecondIsBigger() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 8;
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(10, 10,8);
        if (realResult == expectedResult) {
            System.out.println("First and second is bigger test = OK");
        } else {
            System.out.println("First and second is bigger test = FAIL");
        }
    }
    public void maxOfThreeAreEqual() {
       Calculator calculator = new Calculator();
       int firstNumber = 10;
       int secondNumber = 10;
       int thirdNumber = 10;
       int expectedResult = 10;
       int realResult = calculator.maxOfThreeNumbers(10, 10, 10);
       if (realResult == expectedResult) {
           System.out.println("Three are equal test = OK");
       } else {
           System.out.println("Three are equal test = FAIL");
       }
    }

}