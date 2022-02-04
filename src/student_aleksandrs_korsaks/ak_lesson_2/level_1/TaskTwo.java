package student_aleksandrs_korsaks.ak_lesson_2.level_1;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the 1st decimal number");
        double firstDoubleNumber = scanner.nextDouble();
        System.out.println("Please enter the 2nd decimal number");
        double secondDoubleNumber = scanner.nextDouble();

        double sum = firstDoubleNumber + secondDoubleNumber;
        double sub = firstDoubleNumber - secondDoubleNumber;
        double mult = firstDoubleNumber * secondDoubleNumber;
        double div = firstDoubleNumber / secondDoubleNumber;

        System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + Math.round(sum * 100.0) / 100.0);
        System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + Math.round(sub * 100.0) / 100.0);
        System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + Math.round(mult * 100.0) / 100.0);
        System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + Math.round(div * 100.0) / 100.0);
    }

}
