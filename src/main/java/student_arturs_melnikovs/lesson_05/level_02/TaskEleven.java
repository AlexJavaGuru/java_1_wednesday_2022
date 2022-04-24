package student_arturs_melnikovs.lesson_05.level_02;

import java.util.Scanner;

class TaskEleven {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        System.out.println("Enter numbers...");
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
    }
}
