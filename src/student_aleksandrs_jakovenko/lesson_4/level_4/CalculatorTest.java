package student_aleksandrs_jakovenko.lesson_4.level_4;

class CalculatorTest {
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
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
    public void firstBigger() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        } else {
            System.out.println("First is bigger test = FAIL");
        }
    }
    public void secondBigger() {
        int firstNumber = 5;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        } else {
            System.out.println("Second is bigger test = FAIL");
        }
    }
    public void areEqual() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwo(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Equal test = OK");
        } else {
            System.out.println("Equal test = FAIL");
        }
    }
    public void maxOfThreeFirstIsBigger(){
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        } else {
            System.out.println("First is bigger test = FAIL");
        }
    }
    public void maxOfThreeSecondIsBigger(){
        int firstNumber = 10;
        int secondNumber = 70;
        int thirdNumber = 3;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        } else {
            System.out.println("Second is bigger test = FAIL");
        }
    }
    public void maxOfThreeThirdIsBigger(){
        int firstNumber = 10;
        int secondNumber = 7;
        int thirdNumber = 30;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third is bigger test = OK");
        } else {
            System.out.println("Third is bigger test = FAIL");
        }
    }
    public void maxOfThreeFirstAndSecondIsBigger(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 3;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and second are bigger test = OK");
        } else {
            System.out.println("First and second is bigger test = FAIL");
        }
    }
    public void maxOfThreeAreEqual(){
        int firstNumber = 10;
        int secondNumber = 10;
        int thirdNumber = 10;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Numbers are equal test = OK");
        } else {
            System.out.println("Numbers are equal test = FAIL");
        }
    }

}


