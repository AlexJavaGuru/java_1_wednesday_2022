package student_arturs_melnikovs.lesson_04.level_04;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean ifEven(int firstNumber) {
        return firstNumber % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if(secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if(thirdNumber > secondNumber && thirdNumber > firstNumber){
            return thirdNumber;
        } else if((firstNumber == secondNumber && firstNumber > thirdNumber) || (firstNumber == thirdNumber && firstNumber > secondNumber)){
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
