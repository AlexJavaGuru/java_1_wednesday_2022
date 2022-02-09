package student_arturs_melnikovs.lesson_04.level_02;

import java.util.Scanner;

class TaskSix {
    public static void main(String[] args) {
        System.out.println("Введите 1ое целое число");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        System.out.println("Введите 2ое целое число");
        int secondNum = scanner.nextInt();

        if(firstNum < secondNum) {
            System.out.println(firstNum);
        } else if(secondNum < firstNum) {
            System.out.println(secondNum);
        } else {
            System.out.println("Числа равны");
        }
    }
}
