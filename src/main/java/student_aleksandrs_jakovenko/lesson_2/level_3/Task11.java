package student_aleksandrs_jakovenko.lesson_2.level_3;

import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = scanner.nextInt();
        System.out.println("Enter second number:");
        int second = scanner.nextInt();
        System.out.println("Enter third number:");
        int third = scanner.nextInt();

        double average = (first + second + third)/3.0;
        System.out.println("Average = " + average);
    }
}
