package student_aleksejs_iljins.lesson_04.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstMaxOfTwoNumbersTest();
        calculatorTest.secondMaxOfTwoNumbersTest();
        calculatorTest.thirdMaxOfTwoNumbersTest();
        calculatorTest.oneMaxOfThreeTest();
        calculatorTest.twoMaxOfThreeTest();
        calculatorTest.threeMaxOfThreeTest();
        calculatorTest.firstTwoEqualMaxOfThreeTest();
        calculatorTest.lastTwoEqualMaxOfThreeTest();
        calculatorTest.firstAndLastEqualMaxOfThreeTest();
        calculatorTest.allEqualMaxOfThreeTest();
    }
    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 11;
        int secondNumber = 5;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 30;
        int secondNumber = 5;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 6;
        int expectedResult = 60;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void isEvenTest() {
        int number = 10;
        int expectedResult = number % 2;
        if (expectedResult == 0) {
            System.out.println("Even test = OK");
        } else {
            System.out.println("Even test = FAIL");
        }
        }
        public void firstMaxOfTwoNumbersTest(){
        int firstNumber = 16;
        int secondNumber = 12;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("First num test = OK");
        } else {
            System.out.println("First num test = FAIL");
        }
        }
    public void secondMaxOfTwoNumbersTest(){
        int firstNumber = 12;
        int secondNumber = 14;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Second num test = OK");
        } else {
            System.out.println("Second num test = FAIL");
        }
    }
    public void thirdMaxOfTwoNumbersTest(){
        int firstNumber = 14;
        int secondNumber = 14;
        int expectedResult = 14;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Two num equal test = OK");
        } else {
            System.out.println("Two num equal test = FAIL");
        }
    }
    public void oneMaxOfThreeTest(){
        int a = 16;
        int b = 14;
        int c = 12;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (one) test = OK");
        } else {
            System.out.println("Max of 3 (one) test = FAIL");
        }
    }
    public void twoMaxOfThreeTest(){
        int a = 14;
        int b = 16;
        int c = 12;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (two) test = OK");
        } else {
            System.out.println("Max of 3 (two) test = FAIL");
        }
    }
    public void threeMaxOfThreeTest(){
        int a = 14;
        int b = 12;
        int c = 16;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (three) test = OK");
        } else {
            System.out.println("Max of 3 (three) test = FAIL");
        }
    }
    public void firstTwoEqualMaxOfThreeTest(){
        int a = 16;
        int b = 16;
        int c = 12;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (first two num equal) test = OK");
        } else {
            System.out.println("Max of 3 (first two num equal) test = FAIL");
        }
    }
    public void lastTwoEqualMaxOfThreeTest(){
        int a = 14;
        int b = 16;
        int c = 16;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (last two num equal) test = OK");
        } else {
            System.out.println("Max of 3 (last two num equal) test = FAIL");
        }
    }
    public void firstAndLastEqualMaxOfThreeTest(){
        int a = 16;
        int b = 14;
        int c = 16;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (first and last equal) test = OK");
        } else {
            System.out.println("Max of 3 (first and last equal) test = FAIL");
        }
    }
    public void allEqualMaxOfThreeTest(){
        int a = 16;
        int b = 16;
        int c = 16;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThree(a, b, c);
        if (realResult == expectedResult) {
            System.out.println("Max of 3 (all equal) test = OK");
        } else {
            System.out.println("Max of 3 (all equal) test = FAIL");
        }
    }
}
