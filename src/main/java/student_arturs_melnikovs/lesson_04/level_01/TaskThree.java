package student_arturs_melnikovs.lesson_04.level_01;

import java.util.Scanner;

class TaskThree {
    public static void main(String[] args) {
        System.out.println("Введите целое число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
        }
    }
}
