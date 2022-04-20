package student_alex_stranger.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("Even number!");
        }
        else {
            System.out.println("Odd number!");
        }

    }
}
