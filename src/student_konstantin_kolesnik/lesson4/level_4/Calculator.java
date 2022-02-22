package student_konstantin_kolesnik.lesson4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven(int number) {
        if (number % 2 == 0){
            return true;
        } else return false;
    }
    public int maxOfTwo(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else return secondNumber;
    }
    public int maxOfThree(int firstNum, int secondNum, int thirdNum){
        if (firstNum >= secondNum && firstNum >= thirdNum){
            return firstNum;
        } else if (secondNum >= firstNum && secondNum >= thirdNum) {
            return secondNum;
        } else return thirdNum;
    }
}
