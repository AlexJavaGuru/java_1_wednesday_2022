package studen_natalja_isajeva.lesson_4.level_4;

public class Calculator {

    //task 12
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
//Task 13

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Task 14
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
       if (firstNumber <= secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }

    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (secondNumber <= firstNumber && thirdNumber <= firstNumber ) {
            return firstNumber;
        } else if (firstNumber <= secondNumber && thirdNumber <= secondNumber){
            return secondNumber;
        } else {
            return thirdNumber;
        }

    }
}


