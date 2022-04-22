package student_aleksejs_iljins.lesson_02.level_3;

import java.util.Scanner;

public class Lesson_02_Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Test data:");
        System.out.println("Input a number:");

        int number = scanner.nextInt();

        System.out.println("Result:");

        System.out.println(number + " * 1 = " + (number));
        System.out.println(number + " * 2 = " + (number * 2));
        System.out.println(number + " * 3 = " + (number * 3));
        System.out.println(number + " * 4 = " + (number * 4));
        System.out.println(number + " * 5 = " + (number * 5));
        System.out.println(number + " * 6 = " + (number * 6));
        System.out.println(number + " * 7 = " + (number * 7));
        System.out.println(number + " * 8 = " + (number * 8));
        System.out.println(number + " * 9 = " + (number * 9));
        System.out.println(number + " * 10 = " + (number * 10));
    }
}
