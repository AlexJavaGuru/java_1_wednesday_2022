package student_vladislav_deineka.lesson_5.task_2;

import java.util.Arrays;
import java.util.Scanner;

class Massive2 {
    public static void main(String[] args) {

        int[] numbers = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number 1: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Write number 2: ");
        numbers[1] = scanner.nextInt();
        System.out.println("Write number 3: ");
        numbers[2] = scanner.nextInt();

        System.out.println("Your numbers: " + Arrays.toString(numbers));

    }
}
