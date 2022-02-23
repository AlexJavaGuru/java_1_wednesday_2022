package student_nikita_visnakov.nv_lesson_4;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public  int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public boolean isEven (int number) {
        if ( number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int maxOfTwoNumbers (int firstNumber , int secondNumber) {
        if ( firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
