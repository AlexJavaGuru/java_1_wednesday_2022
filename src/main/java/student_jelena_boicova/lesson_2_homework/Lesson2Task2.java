package student_jelena_boicova.lesson_2_homework;

import java.util.Scanner;

public class Lesson2Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        double secondNumber = scanner.nextInt();
        double resultSum = firstNumber + secondNumber;
        double resultSub = firstNumber - secondNumber;
        double resultMul = firstNumber * secondNumber;
        double resultDiv = firstNumber / secondNumber;

        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + resultSum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + resultSub);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + resultMul);
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + resultDiv);


    }
}
