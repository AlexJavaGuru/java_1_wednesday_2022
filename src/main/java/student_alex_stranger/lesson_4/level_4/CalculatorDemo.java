package student_alex_stranger.lesson_4.level_4;

import java.util.Scanner;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the secondNumber: ");
        int secondNumber = scanner.nextInt();

        int sumResult = calculator.sum(firstNumber,secondNumber);
        System.out.println(firstNumber + "+" + secondNumber + "=" + sumResult);
        int subResult = calculator.sub(firstNumber,secondNumber);
        System.out.println(firstNumber + "-" + secondNumber + "=" + subResult);
        int mulResult = calculator.mul(firstNumber,secondNumber);
        System.out.println(firstNumber + "*" + secondNumber + "=" + mulResult);
        int divResult = calculator.div(firstNumber, secondNumber);
        System.out.println(firstNumber + "/" + secondNumber + "=" + divResult);

    }
}
