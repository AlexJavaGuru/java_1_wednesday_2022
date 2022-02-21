package student_aleksejs_iljins.lesson_05.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа автоматически подбирает длину массива: ");
        System.out.println("...");

        Random random = new Random();
        int size = random.nextInt(10); //ограничение диапазона
        //int size = random.nextInt((20) - 10); - отрицательные числа

        System.out.println("Выбранная длина массива: " + size);

        int [] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Наибольшее число в массиве = " + max);

    }
}
