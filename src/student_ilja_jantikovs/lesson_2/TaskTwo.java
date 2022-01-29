package student_ilja_jantikovs.lesson_2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Enter second number:");
        double secondDoubleNumber = scanner.nextDouble();
        System.out.println("Results:");
        System.out.println(firstDoubleNumber + secondDoubleNumber);
        System.out.println(firstDoubleNumber - secondDoubleNumber);
        System.out.println(firstDoubleNumber * secondDoubleNumber);
        System.out.println(firstDoubleNumber / secondDoubleNumber);
    }
}
