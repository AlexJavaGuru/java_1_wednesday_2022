package student_aleksejs_iljins.lesson_04.level_1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Ваше число " + number + " является положительным.");
        } else if (number < 0) {
            System.out.println("Ваше число " + number + " является отрицательным.");
        } else  {
            System.out.println("Ваше число " + number + " равняется нулю.");
        }
    }
}
