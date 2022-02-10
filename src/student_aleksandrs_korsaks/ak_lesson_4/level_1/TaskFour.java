package student_aleksandrs_korsaks.ak_lesson_4.level_1;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("You`ve entered Even number");
        } else {
            System.out.println("You`ve entered Odd number");
        }
    }
}


