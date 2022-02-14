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
    calculatorTest.maxOfThreeNumbersFirstTest();
    calculatorTest.maxOfThreeNumbersSecondTest();
    calculatorTest.maxOfThreeNumbersThirdTest();
    calculatorTest.maxOfThreeNumbersFirstAndSecondTest();

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
              System.out.println("First is bigger test = OK");
          } else {
              System.out.println("First is bigger test = FAILED");
          }
    }
    public void maxOfTwoNumbersSecondTest() {
         int firstNumber = 100;
         int secondNumber = 150;
         int expectedResult = 150;
         Calculator calculator = new Calculator();
         int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
         if (realResult == expectedResult) {
                System.out.println("Second is bigger test = OK");
         } else {
             System.out.println("Second is bigger test = FAILED");
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
    public void maxOfThreeNumbersFirstTest(){
        int firstNumber = 30;
        int secondNumber = 20;
        int thirdNumber = 10;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First is bigger test = OK");
        } else {
            System.out.println("First is bigger test = OK = FAILED");
    }
}
    public void maxOfThreeNumbersSecondTest(){
        int firstNumber = 20;
        int secondNumber = 100;
        int thirdNumber = 50;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Second is bigger test = OK");
        } else {
            System.out.println("Second is bigger test = OK = FAILED");
        }
    }
    public void maxOfThreeNumbersThirdTest(){
        int firstNumber = 20;
        int secondNumber = 70;
        int thirdNumber = 150;
        int expectedResult = 150;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("Third is bigger test = OK");
        } else {
            System.out.println("Third is bigger test = OK = FAILED");
    }
}
    public void maxOfThreeNumbersFirstAndSecondTest(){
        int firstNumber = 85;
        int secondNumber = 85;
        int thirdNumber = 50;
        int expectedResult = 85;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult) {
            System.out.println("First and second are bigger test = OK");
        } else {
            System.out.println("First and second are bigger test = OK = FAILED");
    }
}
}