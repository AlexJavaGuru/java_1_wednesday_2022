package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_32;

import teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation;

abstract class TwoArgumentMathOperation extends teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation {

	private teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation leftArgument;
	private teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation rightArgument;

	public TwoArgumentMathOperation(teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation leftArgument,
                                    teacher.lesson_8_inheritance.homework.level_7_senior.task_32.MathOperation rightArgument) {
		this.leftArgument = leftArgument;
		this.rightArgument = rightArgument;
	}

	protected double calculateLeftSide() {
		return leftArgument.calculate();
	}

	protected double calculateRightSide() {
		return rightArgument.calculate();
	}

}
