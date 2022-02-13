package student_aleksandrs_korsaks.ak_lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(double firstNumber, double secondNumber) {
        return Math.round((firstNumber / secondNumber) * 100.0) / 100.0;
    }

    public boolean isEven(int number) {
        return (number % 2 == 0);
    }
}