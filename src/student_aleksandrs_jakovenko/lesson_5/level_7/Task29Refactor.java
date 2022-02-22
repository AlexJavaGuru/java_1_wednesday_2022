package student_aleksandrs_jakovenko.lesson_5.level_7;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

public class Task29Refactor {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println("Even numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
