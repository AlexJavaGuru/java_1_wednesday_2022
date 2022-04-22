package student_igors.lesson_5.level_4;

import java.util.Arrays;

public class TaskTwentyNine {
    public static void main(String[] args) {


        int[] numbers = {28, 45, 56, 18, 98};
        System.out.println("Numbers = " + Arrays.toString(numbers));
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println("Numbers = " + numbers[i] + ";");
            }

        }
    }
}


//      Напишите программу, в которой:
//      - создайте массив произвольной длины
//      - заполните массив случайными числами
//      - распечатайте на консоль все элементы массива
//      - найдите все чётные числа в массиве и выведети их на консоль.