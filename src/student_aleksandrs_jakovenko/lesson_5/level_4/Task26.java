package student_aleksandrs_jakovenko.lesson_5.level_4;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
//        int[] numbers;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array length:");
//        int size = scanner.nextInt();
//        numbers = new int[size];
//        for (int i = 0; i < numbers.length; i++) {
//            Random random = new Random();
//            int input = random.nextInt();
//            numbers[i] = input;
//        }
//        System.out.println(Arrays.toString(numbers));

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
    }
}
