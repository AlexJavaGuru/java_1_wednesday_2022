package student_jekaterina_soldatova.lesson_8_inheritance.homework.level_7_senior.task_32;

class Argument extends MathOperation {

	private double argument;

	Argument(double argument) {
		this.argument = argument;
	}

	@Override
	double calculate() {
		return argument;
	}
}
