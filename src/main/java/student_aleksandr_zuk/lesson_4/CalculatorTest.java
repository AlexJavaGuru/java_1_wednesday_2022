package student_aleksandr_zuk.lesson_4;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.subTest();
        calculatorTest.isEvenTest();
        calculatorTest.firstMaxOfTwoNumbers();
        calculatorTest.secondMaxOfTwoNumbers();
        calculatorTest.thirdMaxOfTwoNumbers();
        calculatorTest.firstMaxOfThreeNumbers();
        calculatorTest.secondMaxOfThreeNumbers();
        calculatorTest.thirdMaxOfThreeNumbers();
        calculatorTest.firstTwoEqualOfThreeNumbers();
        calculatorTest.lastTwoEqualOfThreeNumbers();
        calculatorTest.firstAndLastEqualOfThreeNumbers();
        calculatorTest.allEqualOfThreeNumbers();

    }

    public void sumTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test is OK");
        }
        else {
            System.out.println("Sum test FAILED");
        }


    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test is OK");
        }
        else {
            System.out.println("Sub test FAILED");
        }
    }
    public void mulTest() {
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.mul(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Mul test is OK");
        }
        else {
            System.out.println("Mul test FAILED");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Div test is OK");
        }
        else {
            System.out.println("Div test FAILED");
        }
    }
    public void isEvenTest() {
        int number = 10;
        int expectedResult = number % 2;
        if (expectedResult == 0) {
            System.out.println("Even test is OK");
        }
        else {
            System.out.println("Even test FAILED");
        }
    }
    public void firstMaxOfTwoNumbers() {
        int firstNumber = 7;
        int secondNumber = 3;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Max of two numbers test is OK");
        }
        else {
            System.out.println("Max of two numbers test FAILED");
        }
    }
    public void secondMaxOfTwoNumbers(){
        int firstNumber = 3;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Max of two numbers test is OK");
        }
        else {
            System.out.println("Max of two numbers test FAILED");
        }
    }
    public void thirdMaxOfTwoNumbers(){
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("Max of two numbers test is OK");
        }
        else {
            System.out.println("Max of two numbers test FAILED");
        }
    }
    public void firstMaxOfThreeNumbers(){
        int a = 10;
        int b = 5;
        int c = 6;
        int expectedResult = 10;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK");
        }
        else {
            System.out.println("Max of three numbers test FAILED");
        }
    }
    public void secondMaxOfThreeNumbers(){
        int a = 14;
        int b = 25;
        int c = 16;
        int expectedResult = 25;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK");
        }
        else {
            System.out.println("Max of three numbers test FAILED");
        }
    }
    public void thirdMaxOfThreeNumbers(){
        int a = 5;
        int b = 6;
        int c = 7;
        int expectedResult = 7;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK");
        }
        else {
            System.out.println("Max of three numbers test FAILED");
        }

    }
    public void firstTwoEqualOfThreeNumbers(){ // первые два равны и больше третьего
        int a = 5;
        int b = 5;
        int c = 4;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK(two first equal and > 3rd)");
        }
        else{
            System.out.println("Max of three numbers test FAILED(two first equal and > 3rd");
        }

    }
    public void lastTwoEqualOfThreeNumbers(){
        int a = 4;
        int b = 5;
        int c = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK(two last equal and > 1st");
        }
        else {
            System.out.println("Max of three numbers test FAILED(two last equal and > 1st");
        }
    }
    public void firstAndLastEqualOfThreeNumbers(){
        int a = 5;
        int b = 4;
        int c = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK(first and last equal and > 2nd");
        }
        else {
            System.out.println("Max of three numbers test FAILED(first and last equal and > 2nd");
        }
    }
    public void allEqualOfThreeNumbers(){
        int a = 5;
        int b = 5;
        int c = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(a, b, c);
        if (realResult == expectedResult){
            System.out.println("Max of three numbers test is OK(all equal)");
        }
        else {
            System.out.println("Max of three numbers test FAILED(all equal");
        }
    }
}
