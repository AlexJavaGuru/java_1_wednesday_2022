package student_arturs_melnikovs.lesson_04.level_01;

import java.util.Scanner;

class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = scanner.nextInt();

        if(number > 0) {
            System.out.println("Число положительное");
        } else if(number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число = 0");
        }
    }
}
