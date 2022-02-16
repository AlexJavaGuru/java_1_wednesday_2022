package student_vladislav_deineka.lesson_4.level_4;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test(15, calculator.sum(10,5));
        calculatorTest.test(5, calculator.sub(10,5));
        calculatorTest.test(50, calculator.mul(10,5));
        calculatorTest.test(2, calculator.div(10,5));
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }
    public void test(int expectedResult, int realResult) {
        if (realResult == expectedResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven1(40);
        if (result) {
            System.out.println("isEven Test = OK");
        } else {
            System.out.println("isEven Test = FAIL");
        }
    }
    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        int result = calculator.isEven2(41);
        if (result == false) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
}
