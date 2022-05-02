package student_arturs_melnikovs.lesson_08.level_07.task_32;

class MAthOperationDemo {

	public static void main(String[] args) {
		//(10 - 5) * (20 / 5)
		Argument leftArgument1 = new Argument(10);
		Argument leftArgument2 = new Argument(5);
		MathOperation subtraction = new Subtraction(leftArgument1, leftArgument2);

		Argument rightArgument1 = new Argument(20);
		Argument rightArgument2 = new Argument(5);
		MathOperation divide = new Divide(rightArgument1, rightArgument2);

		MathOperation multiply = new Multiply(subtraction, divide);
		System.out.println(multiply.calculate());

	}

}
