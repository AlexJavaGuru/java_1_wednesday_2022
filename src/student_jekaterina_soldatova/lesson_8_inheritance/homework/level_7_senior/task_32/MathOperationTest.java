package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_32;

class MathOperationTest {
    public static void main(String[] args) {
        MathOperationTest test = new MathOperationTest();

        test.addition();
        test.divide();
        test.multiply();
        test.subtraction();
    }

    void addition() {
        Argument arg1 = new Argument(-4);
        Argument arg2 = new Argument(11);
        MathOperation addition = new Addition(arg1, arg2);
        double expectedResult = 7;
        double realResult = addition.calculate();

        if (expectedResult == realResult) {
            System.out.println("addition - OK");
        } else {
            System.out.println("addition - FAIL, real result: " + realResult);
        }
    }

    void divide() {
        Argument arg1 = new Argument(8);
        Argument arg2 = new Argument(-2);
        MathOperation divide = new Divide(arg1, arg2);
        double expectedResult = -4.0;
        double realResult = divide.calculate();

        if (expectedResult == realResult) {
            System.out.println("divide - OK");
        } else {
            System.out.println("divide - FAIL, real result: " + realResult);
        }
    }

    void multiply() {
        Argument arg1 = new Argument(8);
        Argument arg2 = new Argument(-2);
        MathOperation multiply = new Multiply(arg1, arg2);
        double expectedResult = -16.0;
        double realResult = multiply.calculate();

        if (expectedResult == realResult) {
            System.out.println("multiply - OK");
        } else {
            System.out.println("multiply - FAIL, real result: " + realResult);
        }
    }

    void subtraction() {
        Argument arg1 = new Argument(8);
        Argument arg2 = new Argument(-2);
        MathOperation subtraction = new Subtraction(arg1, arg2);
        double expectedResult = 10.0;
        double realResult = subtraction.calculate();

        if (expectedResult == realResult) {
            System.out.println("subtraction - OK");
        } else {
            System.out.println("subtraction - FAIL, real result: " + realResult);
        }
    }

}
