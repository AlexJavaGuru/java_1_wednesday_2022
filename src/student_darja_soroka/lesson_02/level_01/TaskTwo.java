package student_darja_soroka.lesson_02.level_01;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Second Number");
        double secondDoubleNumber = scanner.nextDouble();

        double sumResult = firstDoubleNumber + secondDoubleNumber;
        double subtResult = firstDoubleNumber - secondDoubleNumber;
        double multResult = firstDoubleNumber * secondDoubleNumber;
        double divResult = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Result of Addition: " + sumResult);
        System.out.println("Result of Subtraction: " + subtResult);
        System.out.println("Result of Multiplication: " + multResult);
        System.out.println("Result of Division: " + divResult);

    }
}
