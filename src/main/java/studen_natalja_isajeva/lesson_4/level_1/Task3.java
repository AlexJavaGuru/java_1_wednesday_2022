package studen_natalja_isajeva.lesson_4.level_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type number :");
        int x = scanner.nextInt();

        if (x == 1) {
            System.out.println("Monday");
        } else if (x == 2) {
            System.out.println("Tuesday");
        } else if (x == 3) {
            System.out.println("Wednesday");
        } else if (x == 4) {
            System.out.println("Thursday");
        } else if (x == 5) {
            System.out.println("Friday");
        } else if (x == 6) {
            System.out.println("Saturday");
        } else if (x == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Incorrect number, due to in week only 7 days!");
        }
    }
}
