package studen_natalja_isajeva.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
//Task 13
        calculatorTest.isEvenTest();
//Task 14
        calculatorTest.maxOfFirstNumberTest();
        calculatorTest.maxOfSecondNumberTest();
        calculatorTest.equalNumbersTest();
//Task 15
        calculatorTest.maxFirstOfThreeTest();
        calculatorTest.maxSecondOfThreeTest();
        calculatorTest.maxThirdOfThreeTest();
        calculatorTest.equalFirstSecondOfThreeTest();
        calculatorTest.equalSecondThirdOfThreeTest();
        calculatorTest.equalFirstThirdOfThreeTest();
        calculatorTest.equalOfThreeTest();

    }

    //Task 12
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
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }

    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }


    //task 13

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
// Task 14
    }

    public void maxOfFirstNumberTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(10, 5);
        if (realResult == expectedResult) {
            System.out.println("Max firstNumber test = OK");
        } else {
            System.out.println("Max firstNumber test = FAIL");
        }

    }
    public void maxOfSecondNumberTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(5, 10);
        if (realResult == expectedResult) {
            System.out.println("Max secondNumber test = OK");
        } else {
            System.out.println("Max secondNumber test = FAIL");
        }

    }
    public void equalNumbersTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfTwoNumbers(10, 10);
        if (realResult == expectedResult) {
            System.out.println("Max equalNumber test = OK");
        } else {
            System.out.println("Max equalNumber test = FAIL");
        }
//Task 15
    }
    public void maxFirstOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(10, 5, 2);
        if (realResult == expectedResult) {
            System.out.println("Max firstOfThree test = OK");
        } else {
            System.out.println("Max firstOfThree test = FAIL");
        }

    }
    public void maxSecondOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(5, 10, 2);
        if (realResult == expectedResult) {
            System.out.println("Max secondOfThree test = OK");
        } else {
            System.out.println("Max secondOfThree test = FAIL");
        }

    }
    public void maxThirdOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 10;
        int realResult = calculator.maxOfThreeNumbers(5, 2, 10);
        if (realResult == expectedResult) {
            System.out.println("Max thirdOfThree test = OK");
        } else {
            System.out.println("Max thirdOfThree test = FAIL");
        }

    }
    public void equalFirstSecondOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(20, 20, 5);
        if (realResult == expectedResult) {
            System.out.println("Max equalFirstSecond test = OK");
        } else {
            System.out.println("Max equalFirstSecond test = FAIL");
        }

    }
    public void equalSecondThirdOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(5, 20, 20);
        if (realResult == expectedResult) {
            System.out.println("Max equalSecondThird test = OK");
        } else {
            System.out.println("Max equalSecondThird test = FAIL");
        }

    }
    public void equalFirstThirdOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(20, 5, 20);
        if (realResult == expectedResult) {
            System.out.println("Max equalFirstThird test = OK");
        } else {
            System.out.println("Max equalFirstThird test = FAIL");
        }

    }
    public void equalOfThreeTest() {
        Calculator calculator = new Calculator();
        int expectedResult = 20;
        int realResult = calculator.maxOfThreeNumbers(20, 20, 20);
        if (realResult == expectedResult) {
            System.out.println("Max equal test = OK");
        } else {
            System.out.println("Max equal test = FAIL");
        }

    }
}
