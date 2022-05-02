package student_arturs_melnikovs.lesson_08.level_07.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest tester = new MathOperationTest();
        tester.testAddition();
        tester.testSubtraction();
        tester.testDivision();
        tester.testMultiply();
    }

    public void testSubtraction() {
        Argument argument1 = new Argument(20);
        Argument argument2 = new Argument(5);
        MathOperation subtraction = new Subtraction(argument1, argument2);
        double actualResult = subtraction.calculate();
        double expectedResult = 15;
        checkResult(expectedResult, actualResult, "Subtraction test");
    }
    public void testDivision() {
        Argument argument1 = new Argument(20);
        Argument argument2 = new Argument(5);
        MathOperation division= new Divide(argument1, argument2);
        double actualResult = division.calculate();
        double expectedResult = 4;
        checkResult(expectedResult, actualResult, "Division test");
    }
    public void testMultiply() {
        Argument argument1 = new Argument(20);
        Argument argument2 = new Argument(5);
        MathOperation multiply = new Multiply(argument1, argument2);
        double actualResult = multiply.calculate();
        double expectedResult = 100;
        checkResult(expectedResult, actualResult, "Multiply test");
    }
    public void testAddition() {
        Argument argument1 = new Argument(20);
        Argument argument2 = new Argument(5);
        MathOperation addition = new Addition(argument1, argument2);
        double actualResult = addition.calculate();
        double expectedResult = 25;
        checkResult(expectedResult, actualResult, "Addition test");
    }

    void checkResult(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result: " + expectedResult + "\nActual result: " + actualResult);
        }
    }
}
