package student_aleksandrs_korsaks.ak_lesson_8.level_7.Task_32;

class Addition extends TwoArgumentMathOperation {

	public Addition(MathOperation leftArgument, MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() + calculateRightSide();
	}
}
