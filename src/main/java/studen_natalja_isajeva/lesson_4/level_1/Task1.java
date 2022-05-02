package studen_natalja_isajeva.lesson_4.level_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type number :");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number " + number + "is Positive");
        } else if (number < 0) {
            System.out.println("Number " + number + "is Negative");
        }
    }

}
