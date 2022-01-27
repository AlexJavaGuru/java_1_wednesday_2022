package student_aleksandrs_jakovenko.Lesson2.Level1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        double sum = firstNumber + secondNumber;
        double sub = firstNumber - secondNumber;
        double mul = firstNumber * secondNumber;
        double div = firstNumber / secondNumber;

        System.out.println("Sum result: " + sum);
        System.out.println("Subtraction result: " + sub);
        System.out.println("Multiplication result: " + mul);
        System.out.println("Divide result: " + div);
    }
}
