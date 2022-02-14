package student_jelena_boicova.lesson_4_homerwork;

import teacher.lesson_4_if_statement.lessoncode.basecodetestapproach.MathHelper;

public class CalculatorTest {

    public static void main(String[] args) {

    CalculatorTest calculatorTest = new CalculatorTest();
    calculatorTest.sumTest();
    calculatorTest.subTest();
    calculatorTest.mulTest();
    calculatorTest.divTest();
    calculatorTest.isEvenTest();
    calculatorTest.maxOfTwoNumbersFirstTest();
    calculatorTest.maxOfTwoNumbersSecondTest();
    calculatorTest.maxOfTwoNumbersSecondEqual();

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
        int firstNumber = 20;
        int secondNumber = 5;
        int expectedResult = 15;
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
    public void isEvenTest() {
          int number = 10;
          boolean expectedResult = true;
          Calculator calculator = new Calculator();
          boolean realResult = calculator.isEven(number);
          if (realResult == expectedResult) {
              System.out.println("IsEven test = OK");
          } else {
              System.out.println("IsEven test = FAILED");
          }
    }
    public void maxOfTwoNumbersFirstTest() {
          int firstNumber = 70;
          int secondNumber = 50;
          int expectedResult = 70;
          Calculator calculator = new Calculator();
          int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
          if (realResult == expectedResult) {
              System.out.println("First is bigger = OK");
          } else {
              System.out.println("First is bigger = FAILED");
          }
    }
    public void maxOfTwoNumbersSecondTest() {
         int firstNumber = 100;
         int secondNumber = 150;
         int expectedResult = 150;
         Calculator calculator = new Calculator();
         int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
         if (realResult == expectedResult) {
                System.out.println("Second is bigger = OK");
         } else {
             System.out.println("Second is bigger = FAILED");
        }
    }
    public void maxOfTwoNumbersSecondEqual() {
        int firstNumber = 70;
        int secondNumber = 70;
        int expectedResult = 70;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Equal test = OK");
        } else {
            System.out.println("Equal test = FAILED");
    }
}
}