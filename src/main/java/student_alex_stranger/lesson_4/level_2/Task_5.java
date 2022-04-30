package student_alex_stranger.lesson_4.level_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Greatest number: " + a);
        }
        else {
            System.out.println("Greatest number: " + b);
        }
    }
}
