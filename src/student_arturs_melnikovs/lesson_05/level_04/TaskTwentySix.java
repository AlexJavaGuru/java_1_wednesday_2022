package student_arturs_melnikovs.lesson_05.level_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TaskTwentySix {

    public static void main(String[] args) {
        System.out.println("Введите длину массива..");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }

}
