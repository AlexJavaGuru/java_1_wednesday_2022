package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_32;

import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Addition;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Divide;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Multiply;
import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Subtraction;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg1 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(10);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg2 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(20);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation addition = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg3 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(50);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg4 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(20);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation subtraction = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + subtraction.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation addition1 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// build and calculate: 15 + (5 - 5) * (10 / 2) + 0
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument arg5 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(15);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation subtractionTest = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Subtraction(new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(5), new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(5));
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation test = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(arg5, subtractionTest);
		System.out.println("Final Addition result = " + test.calculate());

		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Divide divide = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Divide(new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(10), new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(2));
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument fakeZero = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Argument(0);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation addition3 = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Addition(divide, fakeZero);
		teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Multiply multiply = new teacher.lesson_8_inheritance.homework.level_7_senior.task_32.Multiply(test, addition3);

		System.out.println(multiply.calculate());

	}

}
