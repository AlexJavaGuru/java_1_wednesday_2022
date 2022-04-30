package student_andrejs_saldavs.lesson_08.level_7.task_32;

class MathOperationTest {

    public static void main(String[] args) {
        MathOperationTest mathOperationTest = new MathOperationTest();
        mathOperationTest.additionTest();
        mathOperationTest.subtractionTest();
        mathOperationTest.divideTest();
        mathOperationTest.multiplyTest();
    }

    public void additionTest() {
        Argument argument1 = new Argument(15);
        Argument argument2 = new Argument(5);
        MathOperation test = new Addition(argument1, argument2);
        double actualResult = test.calculate();
        double expectedResult = 20;
        checkResult(expectedResult, actualResult, "Addition test");
    }

    public void subtractionTest() {
        Argument argument1 = new Argument(15);
        Argument argument2 = new Argument(5);
        MathOperation test = new Subtraction(argument1, argument2);
        double actualResult = test.calculate();
        double expectedResult = 10;
        checkResult(expectedResult, actualResult, "Subtraction test");
    }

    public void divideTest() {
        Argument argument1 = new Argument(15);
        Argument argument2 = new Argument(5);
        MathOperation test = new Divide(argument1, argument2);
        double actualResult = test.calculate();
        double expectedResult = 3;
        checkResult(expectedResult, actualResult, "Divide test");
    }

    public void multiplyTest() {
        Argument argument1 = new Argument(15);
        Argument argument2 = new Argument(5);
        MathOperation test = new Multiply(argument1, argument2);
        double actualResult = test.calculate();
        double expectedResult = 75;
        checkResult(expectedResult, actualResult, "Multiply test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult + " but actual is " + actualResult);
        }
    }
}
