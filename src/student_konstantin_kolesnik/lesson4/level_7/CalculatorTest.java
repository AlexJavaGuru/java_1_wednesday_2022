package student_konstantin_kolesnik.lesson4.level_7;

class CalculatorTest {

	public static void main(String[] args) {
		CalculatorTest calculatorTest = new CalculatorTest();
		calculatorTest.sumTest();
		calculatorTest.subTest();
		calculatorTest.mulTest();
		calculatorTest.divTest();
		calculatorTest.isEvenTest(40);
	}

	void sumTest() {
		int firstNumber = 35;
		int secondNumber = 40;
		Calculator calculator = new Calculator();
		int result = calculator.sum(firstNumber, secondNumber);
		checkResults(result == 75, "Sum test");
	}

	void subTest() {
		int firstNumber = 35;
		int secondNumber = 15;
		Calculator calculator = new Calculator();
		int result = calculator.sub(firstNumber, secondNumber);
		checkResults(result == 20, "Sub test");
	}

	void mulTest() {
		int firstNumber = 5;
		int secondNumber = 5;
		Calculator calculator = new Calculator();
		int result = calculator.mul(firstNumber, secondNumber);
		checkResults(result == 25, "Mul test");
	}

	void divTest() {
		int firstNumber = 40;
		int secondNumber = 8;
		Calculator calculator = new Calculator();
		int result = calculator.div(firstNumber, secondNumber);
		checkResults(result == 5, "Div test");
	}

	void isEvenTest(int testValue) {
		Calculator calculator = new Calculator();
		boolean result = calculator.isEven(testValue);
		checkResults(result, "isEven test");
	}

	void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}