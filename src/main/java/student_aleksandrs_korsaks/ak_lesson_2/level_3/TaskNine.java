package student_aleksandrs_korsaks.ak_lesson_2.level_3;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
