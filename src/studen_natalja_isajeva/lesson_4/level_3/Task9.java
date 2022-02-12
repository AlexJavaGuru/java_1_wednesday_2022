package studen_natalja_isajeva.lesson_4.level_3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int x = scanner.nextInt();
        System.out.println("Type second number :");
        int y = scanner.nextInt();
        System.out.println("Type third number :");
        int z = scanner.nextInt();

        if ((x < y) && (y < z)) {
            System.out.println("Increasing");
        } else if ((x > y) && (z < y)) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
