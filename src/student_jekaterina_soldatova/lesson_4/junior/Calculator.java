package student_jekaterina_soldatova.lesson_4.junior;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int difference(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }


    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber != secondNumber) {
            return firstNumber > secondNumber ? firstNumber : secondNumber;
        } else {
            System.out.println("Numbers are equal");
            return firstNumber;
        }
    }

    int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
            return firstNumber;
        } else {
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                return firstNumber;
            } else return Math.max(thirdNumber, secondNumber);
        }
    }
}
