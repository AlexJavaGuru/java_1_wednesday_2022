package student_aleksandrs_jakovenko.lesson_5.level_7;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

import java.util.Scanner;

public class Task25Refactor {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);

        System.out.println("Enter numbers:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            int input = scanner.nextInt();
            numbers[i] = input;
        }
        arrayUtil.printArrayToConsole(numbers);
    }
}
