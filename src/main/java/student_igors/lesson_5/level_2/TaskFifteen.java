package student_igors.lesson_5.level_2;

import java.util.Arrays;

public class TaskFifteen {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = 7;
        System.out.println("Numbers is: " + Arrays.toString(numbers));

        int sum = 2;
        for (int i = 0; i < numbers.length; i++) {
        int result = sum + numbers[i];

            System.out.println("Result is :" + result);
        }
    }
}


//     Напишите программу, в которой:
//     - создайте массив целых чисел длиной 3,
//     - заполните каждую ячейку массива случайным числом,
//     - выведите значение каждой ячейки на консоль,
//     - увеличьте значение каждой ячейки на 2,
//     - выведите значение каждой ячейки на консоль.