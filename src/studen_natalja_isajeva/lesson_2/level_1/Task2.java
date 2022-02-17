package studen_natalja_isajeva.lesson_2.level_1;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number with decimal:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Second number with decimal:");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Calculating:");

        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Summa: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

    }
}
