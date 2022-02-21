package studen_natalja_isajeva.lesson_4.level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int x = scanner.nextInt();
        System.out.println("Type second number :");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("Number " + x + " is bigger number!");
        } else {
            System.out.println("Number " + y + " is bigger number!");
        }
    }
}
