package student_aleksandrs_jakovenko;

import java.util.Scanner;

//Write a Java program to print the sum of two numbers.

public class Homework_lesson1_task11_sum {
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