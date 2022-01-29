package student_aleksandrs_jakovenko.lesson_1;

import java.util.Scanner;

//Write a Java program to print the sum of two numbers.

public class Lesson1Task11Sum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = num.nextInt();

        System.out.println("Enter second number: ");
        int num2 = num.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum = " + sum);
    }
}