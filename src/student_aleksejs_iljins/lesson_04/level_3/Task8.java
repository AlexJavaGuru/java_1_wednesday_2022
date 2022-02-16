package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        System.out.println("Input second number: ");
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("\"All numbers are equal\"");
        } else if (a != b && b != c && a != c) {
            System.out.println("\"All numbers are different\"");
        } else if (a == b || a == c || a != c || b != c) {
            System.out.println("\"Neither all are equal or different\"" );
        }
    }
}
