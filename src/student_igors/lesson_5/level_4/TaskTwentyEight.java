package student_igors.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskTwentyEight {
    public static void main(String[] args) {


        int[] numbers = {28, 45, 56, 18, 98};
        System.out.println("Numbers = " + Arrays.toString(numbers));
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);
    }
}


//       Напишите программу, в которой:
//       - создайте массив произвольной длины
//       - заполните массив случайными числами
//       - распечатайте на консоль все элементы массива
//       - найдите наименьшее число в массиве и выведети его на консоль.