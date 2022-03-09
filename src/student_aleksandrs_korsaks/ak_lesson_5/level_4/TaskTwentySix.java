package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import student_aleksandrs_korsaks.ak_lesson_5.level_5.ArrayUtil;

import java.util.Scanner;

class TaskTwentySix {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Array`s length");
        int arrayLength = scanner.nextInt();
        int[] numbers = arrayUtil.createArray(arrayLength);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
    }
}

