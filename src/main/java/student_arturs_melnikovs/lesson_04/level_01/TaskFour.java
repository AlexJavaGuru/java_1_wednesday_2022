package student_arturs_melnikovs.lesson_04.level_01;

import java.util.Scanner;

class TaskFour {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число не чётное");
        }
    }
}
