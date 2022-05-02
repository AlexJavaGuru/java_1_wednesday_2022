package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_32;

class Multiply extends TwoArgumentMathOperation {

	Multiply(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}

