package student_arturs_melnikovs.lesson_05.level_04;

import java.util.Arrays;
import java.util.Scanner;

class TaskTwentyfive {

    public static void main(String[] args) {
        System.out.println("Введите длину массива..");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        System.out.println("Заполните массив..");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }

}
