package student_nikita_visnakov.nv_lesson_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest CalculatorTest = new CalculatorTest();
        CalculatorTest.sumTest();
        CalculatorTest.subTest();
        CalculatorTest.mulTest();
        CalculatorTest.divTest();
        CalculatorTest.evenTest();
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
            System.out.println("Sub test = ok");
            } else {
            System.out.println("Sub test = fail");
        }
    }
    public void mulTest() {
        int firstNumber = 2;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multi test = ok");
        } else {
            System.out.println("multi test = fail");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = ok");
        } else {
            System.out.println("Div test = fail");
        }
    }
    public void evenTest() {
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
        System.out.println("Even Test is True");
        } else {
            System.out.println("Even Test if fail");
        }
    }
}
