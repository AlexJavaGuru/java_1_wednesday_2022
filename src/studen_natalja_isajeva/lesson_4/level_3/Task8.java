package studen_natalja_isajeva.lesson_4.level_3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int x = scanner.nextInt();
        System.out.println("Type second number :");
        int y = scanner.nextInt();
        System.out.println("Type third number :");
        int z = scanner.nextInt();

        if ((x == y) && (x == z)) {
            System.out.println("All  numbers are equal");
        } else if ((x != y) && (x != z)) {
            System.out.println("All  numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
