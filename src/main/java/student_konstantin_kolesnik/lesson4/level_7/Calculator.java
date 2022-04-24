package student_konstantin_kolesnik.lesson4.level_7;

class Calculator {

	int sum(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	int sub(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	int mul(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	int div(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}

	boolean isEven(int number) {
		return number % 2 == 0;
	}

}