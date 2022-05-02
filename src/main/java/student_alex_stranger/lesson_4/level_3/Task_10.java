package student_alex_stranger.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter the third integer: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " largest integer!");
        }

        else if (b > a && b > c) {
            System.out.println(b + " largest integer!");
        }

        else {
            System.out.println(c + " largest integer!");
        }

    }
}