package student_alex_stranger.lesson_4.level_7;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest caculatorTest = new CalculatorTest();
        caculatorTest.sumTest();
        caculatorTest.subTest();
        caculatorTest.mulTest();
        caculatorTest.divTest();
        caculatorTest.isEvenTest1();
        caculatorTest.isEvenTest2();
    }
    public void sumTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int expectedResult = 15;
        int realResult = calculator.sum(a, b);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int expectedResult = 5;
        int realResult = calculator.sub(a, b);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void mulTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int expectedResult = 50;
        int realResult = calculator.mul(a, b);
        if (realResult == expectedResult) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int expectedResult = 2;
        int realResult = calculator.div(a, b);
        if (realResult == expectedResult) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEvenTest1() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("Is even test 1 = OK");
        } else {
            System.out.println("Is even test 1 = FAIL");
        }
    }
    public void isEvenTest2() {
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(11);
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("Is even test 2 = OK");
        } else {
            System.out.println("Is even test 2 = FAIL");
        }
    }
}
