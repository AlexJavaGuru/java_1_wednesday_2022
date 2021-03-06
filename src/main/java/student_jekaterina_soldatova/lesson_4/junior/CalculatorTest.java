package student_jekaterina_soldatova.lesson_4.junior;


class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.differenceTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();

        calculatorTest.isEven();

        calculatorTest.biggestFirstNumber();
        calculatorTest.biggestSecondNumber();
        calculatorTest.biggestBothNumbers();

        calculatorTest.biggestOfThreeNumbersAllDifferentFirst();
        calculatorTest.biggestOfThreeNumbersAllDifferentSecond();
        calculatorTest.biggestOfThreeNumbersAllDifferentThird();
        calculatorTest.biggestOfThreeNumbersAllEqual();
        calculatorTest.biggestOfThreeNumbersFirstTwoEqualFirst();
        calculatorTest.biggestOfThreeNumbersFirstTwoEqualThird();
        calculatorTest.biggestOfThreeNumbersLastTwoEqualFirst();
        calculatorTest.biggestOfThreeNumbersLastTwoEqualThird();
        calculatorTest.biggestOfThreeNumbersOddTwoEqualFirst();
        calculatorTest.biggestOfThreeNumbersLastTwoEqualThird();
    }

    void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void differenceTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 8;  // подготавливаем тестовые данные
        int expectedResult = 2;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.difference(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Difference test = OK");
        } else {
            System.out.println("Difference test = FAIL");
        }
    }

    void multiplyTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 8;  // подготавливаем тестовые данные
        int expectedResult = 80;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    void divideTest() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 4;  // подготавливаем тестовые данные
        int expectedResult = 3;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.division(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEven() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        boolean expectedResult = false;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(firstNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Is even test = OK");
        } else {
            System.out.println("Is even test = FAIL");
        }
    }

    void biggestFirstNumber() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 8;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest first number test = OK");
        } else {
            System.out.println("Biggest first number test = FAIL");
        }
    }

    void biggestSecondNumber() {
        int firstNumber = 8;  // подготавливаем тестовые данные
        int secondNumber = 12;
        int expectedResult = 12;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest second number test = OK");
        } else {
            System.out.println("Biggest second number test = FAIL");
        }
    }

    void biggestBothNumbers() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest both numbers test = OK");
        } else {
            System.out.println("Biggest both numbers test = FAIL");
        }
    }

    void biggestOfThreeNumbersAllDifferentFirst() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 8;
        int thirdNumber = 9;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, max first number test = OK");
        } else {
            System.out.println("Biggest of three, max first number test = FAIL");
        }
    }


    void biggestOfThreeNumbersAllDifferentSecond() {
        int firstNumber = 7;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 9;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, max second number test = OK");
        } else {
            System.out.println("Biggest of three, max second number test = FAIL");
        }
    }


    void biggestOfThreeNumbersAllDifferentThird() {
        int firstNumber = 9;  // подготавливаем тестовые данные
        int secondNumber = 8;
        int thirdNumber = 11;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, max third number test = OK");
        } else {
            System.out.println("Biggest of three, max third number test = FAIL");
        }
    }

    void biggestOfThreeNumbersAllEqual() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, all equal test = OK");
        } else {
            System.out.println("Biggest of three, all equal test = FAIL");
        }
    }

    void biggestOfThreeNumbersFirstTwoEqualFirst() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 8;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, first two equal, max first number test = OK");
        } else {
            System.out.println("Biggest of three, first two equal, max first number test = FAIL");
        }
    }


    void biggestOfThreeNumbersFirstTwoEqualThird() {
        int firstNumber = 11;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 12;
        int expectedResult = 12;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, first two equal, max third number test = OK");
        } else {
            System.out.println("Biggest of three, first two equal, max third number test = FAIL");
        }
    }

    void biggestOfThreeNumbersLastTwoEqualFirst() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 12;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, last two equal, max first number test = OK");
        } else {
            System.out.println("Biggest of three, last two equal, max first number test = FAIL");
        }
    }

    void biggestOfThreeNumbersLastTwoEqualThird() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 11;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, last two equal, max third number test = OK");
        } else {
            System.out.println("Biggest of three, last two equal, max third number test = FAIL");
        }
    }

    void biggestOfThreeNumbersOddTwoEqualFirst() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 11;
        int thirdNumber = 12;
        int expectedResult = 12;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, odd in sequence equal, max first number test = OK");
        } else {
            System.out.println("Biggest of three, odd in equal, max first number test = FAIL");
        }
    }

    void biggestOfThreeNumbersOddTwoEqualSecond() {
        int firstNumber = 12;  // подготавливаем тестовые данные
        int secondNumber = 13;
        int thirdNumber = 12;
        int expectedResult = 13;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Biggest of three, odd in sequence equal, max second number test = OK");
        } else {
            System.out.println("Biggest of three, odd in equal, max second number test = FAIL");
        }
    }


}
