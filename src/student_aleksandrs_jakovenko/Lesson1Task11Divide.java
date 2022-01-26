package student_aleksandrs_jakovenko;

import java.util.Scanner;

//Write a Java program to divide two numbers and print on the screen.

public class Lesson1Task11Divide {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = num.nextInt();

        System.out.println("Enter second number: ");
        int num2 = num.nextInt();

        int div = num1 / num2;
        System.out.println("Result = " + div);
    }
}