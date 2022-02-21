package student_aleksejs_iljins.lesson_05.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {

        int [] numbers = {1, 2, 3};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо ввести три целых числа.");

        System.out.println("Введите первое число: ");
        numbers [0] = scanner.nextInt();

        System.out.println("Введите второе число: ");
        numbers [1] = scanner.nextInt();

        System.out.println("Введите третье число");
        numbers [2] = scanner.nextInt();

        System.out.println("Вы ввели следующие цифры: ");
        System.out.println(Arrays.toString(numbers));

    }
}
