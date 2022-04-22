package student_igors.lesson_5.level_2;

import java.util.Arrays;

public class TaskThirteen {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = 7;
        System.out.println("Numbers is: " + Arrays.toString(numbers));

        int result = numbers[0] + numbers[1] + numbers[2];

        System.out.println("Result is :" + result);
    }
}


//      Написашите программу, в которой:
//      - создайте массив целых чисел длиной 3,
//      - заполните каждую ячейку массива случайным числом,
//      - посчитайте сумму всех ячеек и распечатайте ее на консоль.