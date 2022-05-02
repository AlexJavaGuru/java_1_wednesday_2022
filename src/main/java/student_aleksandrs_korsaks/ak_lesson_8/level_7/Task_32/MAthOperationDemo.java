package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_32;

class MAthOperationDemo {

    public static void main(String[] args) {
        // build and calculate: 10 + 20
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        MathOperation addition = new Addition(arg1, arg2);
        System.out.println("Left side Addition result = " + addition.calculate());

        // build and calculate: 50 - 20
        Argument arg3 = new Argument(50);
        Argument arg4 = new Argument(20);
        MathOperation subtraction = new Subtraction(arg3, arg4);
        System.out.println("Right side Subtraction result = " + subtraction.calculate());

        // build and calculate: (10 + 20) + (50 - 20)
        MathOperation addition1 = new Addition(addition, subtraction);
        System.out.println("Final Addition result = " + addition1.calculate());

        // build and calculate: 15 + (5 - 5) * (10 / 2) + 0
        Argument arg5 = new Argument(15);
        Argument fakeZero = new Argument(0);
        MathOperation subtractionTest = new Subtraction(new Argument(5), new Argument(5));
        Divide divide = new Divide(new Argument(10), new Argument(2));
        Multiply multiply = new Multiply(subtractionTest, divide);
        MathOperation test = new Addition(multiply, fakeZero);
        MathOperation test2 = new Addition(test, arg5);
        System.out.println("15 + (5 - 5) * (10 / 2) + 0 = " + test2.calculate());

        // build and calculate: (10 - 5) * (20 / 5)
        MathOperation subtraction1 = new Subtraction(new Argument(10), new Argument(5));
        MathOperation divide1 = new Divide(new Argument(20), new Argument(5));
        MathOperation multiply1 = new Multiply(subtraction1, divide1);
        System.out.println("(10 - 5) * (20 / 5) = " + multiply1.calculate());
    }

}
