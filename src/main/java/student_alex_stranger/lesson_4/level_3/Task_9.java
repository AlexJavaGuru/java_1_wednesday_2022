package student_alex_stranger.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Enter third number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Increasing!");
        }
        else if (a > b && b > c) {
            System.out.println("Decreasing!");
        }
        else {
            System.out.println("Neither increasing or decreasing!");
        }
    }
}