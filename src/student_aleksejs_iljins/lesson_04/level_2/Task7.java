package student_aleksejs_iljins.lesson_04.level_2;

import java.util.Scanner;

class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("\"Numbers are equals\"");
        } else if (a != b) {
            System.out.println("\"Numbers are different\"");
        }
    }
}
