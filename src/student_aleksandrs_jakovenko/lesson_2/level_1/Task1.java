package student_aleksandrs_jakovenko.lesson_2.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int mul = firstNumber * secondNumber;
        double div = (double)firstNumber / secondNumber;

        System.out.println("Sum result: " + sum);
        System.out.println("Subtraction result: " + sub);
        System.out.println("Multiplication result: " + mul);
        System.out.println("Divide result: " + div);
    }
}
