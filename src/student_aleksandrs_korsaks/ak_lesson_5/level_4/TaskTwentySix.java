package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class TaskTwentySix {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Array`s length");
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Array`s element nr. " + (i + 1) + " = " + numbers[i]);
        }
    }
}

