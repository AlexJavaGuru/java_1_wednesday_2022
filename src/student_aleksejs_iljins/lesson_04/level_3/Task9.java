package student_aleksejs_iljins.lesson_04.level_3;

import java.util.Scanner;

class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = scanner.nextInt();
        System.out.println("Input second number: ");
        int b = scanner.nextInt();
        System.out.println("Input third number: ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("\"Increasing\"");
        } else if (a > b && b > c) {
            System.out.println("\"Decreasing\"");
        } else if (a > b || b < c || a < b || b > c || a == b || b == c) {
            System.out.println("\"Neither increasing or decreasing order\"" );
        }
    }
}
