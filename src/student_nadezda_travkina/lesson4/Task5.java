package student_nadezda_travkina.lesson4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number ");
        int x = scanner.nextInt();
        System.out.println("Type second number ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        }
    }
}
