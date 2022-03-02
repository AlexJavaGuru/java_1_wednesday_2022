package student_aleksejs_iljins.lesson_04.level_1;

import java.util.Scanner;

class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Понедельник");
        } else if (number == 2) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Вторник");
        } else if (number == 3) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Среда");
        } else if (number == 4) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Четверг");
        } else if (number == 5) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Пятница");
        } else if (number == 6) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Суббота");
        } else if (number== 7) {
            System.out.println("Ввод: " + number);
            System.out.println("Вывод: Воскресенье");
        }
    }
}
