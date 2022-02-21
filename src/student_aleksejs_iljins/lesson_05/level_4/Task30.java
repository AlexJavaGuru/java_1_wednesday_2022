package student_aleksejs_iljins.lesson_05.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа автоматически подбирает длину массива: ");
        System.out.println("...");

        Random random = new Random();
        int size = random.nextInt(10);

        System.out.println("Выбранная длина массива: " + size);

        int [] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("Все нечётные числа в массиве: ");

        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
