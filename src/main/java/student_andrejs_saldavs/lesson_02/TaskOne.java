package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int sub = firstNumber - secondNumber;
        int div = firstNumber / secondNumber;
        int mul = firstNumber * secondNumber;

        System.out.println("Sum result is " + sum);
        System.out.println("Divide result is " + div);
        System.out.println("Subtraction result is " + sub);
        System.out.println("Multiplication result is " + mul);
    }

}
