package student_aleksejs_iljins.lesson_04.level_1;

import java.util.Scanner;

class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        int b = 2;
        int c = a % b;

        if (c == 0) {
            System.out.println("Ваше число чётное");
        }
        if (c != 0) {
            System.out.println("Ваше число нечётное");
        }
    }
}
