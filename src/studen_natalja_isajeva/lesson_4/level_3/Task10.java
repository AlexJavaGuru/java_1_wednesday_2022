package studen_natalja_isajeva.lesson_4.level_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number :");
        int x = scanner.nextInt();
        System.out.println("Type second number :");
        int y = scanner.nextInt();
        System.out.println("Type third number :");
        int z = scanner.nextInt();

        if (z>y && z>x) {
            System.out.println("Number " + z + " is bigger number!");
        } else if (x<y) {
            System.out.println("Number " + y + " is bigger number!");
        } else if (x>z && x>y) {
            System.out.println("Number " + x + " is bigger number!");
        }  else {
            System.out.println("Number " + x + " is bigger number!");
        }
    }
}
