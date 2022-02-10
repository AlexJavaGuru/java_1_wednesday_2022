package student_andrejs_saldavs.lesson_02;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first float number: ");
        double firstDoubleNumber = scanner.nextDouble();

        System.out.println("Enter second float number: ");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;
        double mul = firstDoubleNumber * secondDoubleNumber;

        System.out.println("Sum result is " + sum);
        System.out.println("Divide result is " + div);
        System.out.println("Subtraction result is " + sub);
        System.out.println("Multiplication result is " + mul);
    }
}
