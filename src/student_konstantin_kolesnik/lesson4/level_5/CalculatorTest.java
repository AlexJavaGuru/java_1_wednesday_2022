package student_konstantin_kolesnik.lesson4.level_5;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.multTest();
        calculatorTest.divTest();
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
        int firstNumber = 12;
        int secondNumber = 3;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void multTest() {
        int firstNumber = 2;
        int secondNumber = 2;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
                System.out.println("Sum test = FAIL");
        }
    }

    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
}
