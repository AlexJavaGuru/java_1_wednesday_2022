package studen_natalja_isajeva.lesson_4.level_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number :");
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("Number " + x + " is Event");
        } else {
            System.out.println("Number " + x + " is Odd");
        }
    }
}
