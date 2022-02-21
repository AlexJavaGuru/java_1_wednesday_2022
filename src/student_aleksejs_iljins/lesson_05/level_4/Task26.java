package student_aleksejs_iljins.lesson_05.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int size = scanner.nextInt();

        int [] numbers = new int[size];

        System.out.println("Программа автоматически подберёт случайные цифры и выведет их на экран: ");

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

    }
}
