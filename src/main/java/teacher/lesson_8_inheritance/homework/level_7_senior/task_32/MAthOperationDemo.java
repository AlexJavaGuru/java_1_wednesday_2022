package teacher.lesson_8_inheritance.homework.level_7_senior.task_32;

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
		MathOperation subtractionTest = new Subtraction(new Argument(5), new Argument(5));
		MathOperation test = new Addition(arg5, subtractionTest);
		System.out.println("Final Addition result = " + test.calculate());

		Divide divide = new Divide(new Argument(10), new Argument(2));
		Argument fakeZero = new Argument(0);
		MathOperation addition3 = new Addition(divide, fakeZero);
		Multiply multiply = new Multiply(test, addition3);

		System.out.println(multiply.calculate());

	}

}
