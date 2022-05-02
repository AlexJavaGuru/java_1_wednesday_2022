package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest mathOperationTest = new MathOperationTest();
        mathOperationTest.additionTest();
        mathOperationTest.subtractionTest();
        mathOperationTest.multiplyTest();
        mathOperationTest.divideTest();

    }

    public void additionTest() {
        Argument arg1 = new Argument(2);
        Argument arg2 = new Argument(3);
        MathOperation addition = new Addition(arg1, arg2);
        double actualResult = addition.calculate();
        double expectedResult = 5;
        checkResult("additionTest", actualResult == expectedResult);
    }

    public void subtractionTest() {
        Argument arg1 = new Argument(3);
        Argument arg2 = new Argument(2);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double actualResult = subtraction.calculate();
        double expectedResult = 1;
        checkResult("subtractionTest", actualResult == expectedResult);
    }

    public void multiplyTest() {
        Argument arg1 = new Argument(3);
        Argument arg2 = new Argument(2);
        MathOperation multiply = new Multiply(arg1, arg2);
        double actualResult = multiply.calculate();
        double expectedResult = 6;
        checkResult("multiplyTest", actualResult == expectedResult);
    }

    public void divideTest() {
        Argument arg1 = new Argument(3);
        Argument arg2 = new Argument(2);
        MathOperation divide = new Divide(arg1, arg2);
        double actualResult = divide.calculate();
        double expectedResult = 1.5;
        checkResult("divideTest", actualResult == expectedResult);
    }

    public void checkResult(String nameOfTest, boolean result) {
        if (result) {
            System.out.println("\"" + nameOfTest + "\"" + " test = OK");
        } else {
            System.out.println("\"" + nameOfTest + "\"" + " test = FAIL");
        }
    }
}
