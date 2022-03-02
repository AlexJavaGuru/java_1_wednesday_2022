package student_arturs_melnikovs.lesson_05.level_04;

import student_arturs_melnikovs.lesson_05.level_05.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class TaskTwentySix {

    public static void main(String[] args) {
        System.out.println("Введите длину массива..");
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

//        level 7 рефакторинг, используя созданный в level_06  клас ArrayUtil
//
//        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.fillArrayWithRandomNumbers(numbers);
//        arrayUtil.printArrayToConsole(numbers);
    }

}
