package student_igors.lesson_5.level_2;

import java.util.Arrays;

public class TaskFourteen {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = 7;
        System.out.println("Numbers is: " + Arrays.toString(numbers));

        double result = (numbers[0] + numbers[1] + numbers[2]) / 3;

        System.out.println("Result is :" + result);
    }

}

//       Напишите программу, в которой:
//       - создайте массив целых чисел длиной 3,
//       - заполните каждую ячейку массива случайным числом,
//       - посчитайте среднее значение и выведите его на консоль.