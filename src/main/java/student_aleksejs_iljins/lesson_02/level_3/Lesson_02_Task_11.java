package student_aleksejs_iljins.lesson_02.level_3;

import java.util.Scanner;

public class Lesson_02_Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое целое число:");
        int first = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int second = scanner.nextInt();
        System.out.println("Введите третье целое число:");
        int third = scanner.nextInt();

        double summa = (first + second + third);
        double result = (summa / 3);
        System.out.println("Среднее арифметическое ваших чисел: " + result);
    }
}
