package student_jelena_boicova.lesson_2_homework;

import java.util.Scanner;

public class Lesson2Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        int resultSum = firstNumber + secondNumber;
        int resultSub = firstNumber - secondNumber;
        int resultMul = firstNumber * secondNumber;
        int resultDiv = firstNumber / secondNumber;

        System.out.println("Addition: " + firstNumber + " + " + secondNumber + " = " + resultSum);
        System.out.println("Subtraction: " + firstNumber + " - " + secondNumber + " = " + resultSub);
        System.out.println("Multiplication: " + firstNumber + " * " + secondNumber + " = " + resultMul);
        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + resultDiv);


    }
}
