package student_aleksandrs_jakovenko.lesson_4.level_7;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }
    public void checkResult(int actualResult, int expectedResult, String testName){
        if (actualResult == expectedResult){
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
    public void checkResultBoolean(boolean actualResult, boolean expectedResult, String testName){
        if (actualResult == expectedResult){
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void sumTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(35,40);
        int expectedResult = 75;
        checkResult(actualResult, expectedResult, "Sum test");
    }

    public void subTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sub(35,15);
        int expectedResult = 20;
        checkResult(actualResult, expectedResult, "Sub test");
    }

    public void mulTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.mul(5,5);
        int expectedResult = 25;
        checkResult(actualResult, expectedResult, "Mul test");
    }

    public void divTest() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.div(40,8);
        int expectedResult = 5;
        checkResult(actualResult, expectedResult, "Div test");
    }

    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(40);
        boolean expectedResult = true;
        checkResultBoolean(actualResult, expectedResult, "isEvenTest1");
    }

    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(41);
        boolean expectedResult = false;
        checkResultBoolean(actualResult, expectedResult, "isEvenTest2");
    }
}
