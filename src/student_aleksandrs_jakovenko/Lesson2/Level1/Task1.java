package student_aleksandrs_jakovenko.Lesson2.Level1;

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
        int div = firstNumber / secondNumber;

        System.out.println("Sum result: " + sum);
        System.out.println("Subtraction result: " + sub);
        System.out.println("Multiplication result: " + mul);
        System.out.println("Divide result: " + div);
    }
}
