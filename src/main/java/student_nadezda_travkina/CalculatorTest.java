package student_nadezda_travkina;

import student_nadezda_travkina.lesson4.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.testSum();
        calculatorTest.testMinus();
        calculatorTest.testMultiplication();
        calculatorTest.testDivision();
        calculatorTest.maxOfTwoNumbers();

    }

    public void testSum() {
        Calculator subject = new Calculator();
        int x = 10;  // подготавливаем тестовые данные
        int y = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        int actualResult = subject.calc(10,5, '+');

        Calculator calculator = new Calculator();
        int realResult = calculator.calc(10, 5, '+');  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void testMinus() {
        Calculator subject = new Calculator();
        int x = 11;
        int y = 5;
        int expectedResult = 6;
        int actualResult = subject.calc(11,5, '-');

        Calculator calculator = new Calculator();
        int realResult = calculator.calc(11, 5, '-');
        if (realResult == expectedResult) {
            System.out.println("Minus test = OK");
        } else {
            System.out.println("Minus test = FAIL");
        }
    }
    public void testMultiplication() {
        Calculator subject = new Calculator();
        int x = 10;
        int y = 5;
        int expectedResult = 50;
        int actualResult = subject.calc(10,5, '*');

        Calculator calculator = new Calculator();
        int realResult = calculator.calc(10, 5, '*');
        if (realResult == expectedResult) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void testDivision() {
        Calculator subject = new Calculator();
        int x = 10;
        int y = 5;
        int expectedResult = 2;
        int actualResult = subject.calc(10,5, '/');

        Calculator calculator = new Calculator();
        int realResult = calculator.calc(10, 5, '/');
        if (realResult == expectedResult) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
    public void maxOfTwoNumbers() {
        Calculator subject = new Calculator();
        int x = 10;
        int y = 5;
        int expectedResult = 10;
        int actualResult = subject.calc(10,5, '>');

        Calculator calculator = new Calculator();
        int realResult = calculator.calc(10, 5, '>');
        if (realResult == expectedResult) {
            System.out.println("maxOfTwoNumbers test = OK");
        } else {
            System.out.println("maxOfTwoNumbers test = FAIL");
        }
    }
}
