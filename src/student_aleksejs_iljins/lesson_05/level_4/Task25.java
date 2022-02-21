package student_aleksejs_iljins.lesson_05.level_4;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива от 1 до 6: ");
        int size = scanner.nextInt();

        int [] numbers = new int[size];

        System.out.println("Введите то количество цифр, которое выбрали в длине массива:");

        for (int i = 0; i < numbers.length; i++) {
            int userInput = scanner.nextInt();
            numbers[i] = userInput;
        }

        System.out.println("Ваши цифры: ");
        System.out.println(Arrays.toString(numbers));

    }
}
