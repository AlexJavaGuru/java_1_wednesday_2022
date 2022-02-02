package student_arturs_melnikovs.lesson_02.level_1;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the 1st non-integer: ");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please, enter the 2nd non-integer: ");
        double secondDoubleNumber = scanner.nextDouble();

        double summResult = firstDoubleNumber + secondDoubleNumber;
        double subResult = firstDoubleNumber - secondDoubleNumber;
        double multResult = firstDoubleNumber * secondDoubleNumber;
        double divResult = firstDoubleNumber / secondDoubleNumber;

        System.out.println("Summation result: " + summResult);
        System.out.println("Subtraction result: " + subResult);
        System.out.println("Multiplication result: " + multResult);
        System.out.println("Division result: " + divResult);
    }
}
