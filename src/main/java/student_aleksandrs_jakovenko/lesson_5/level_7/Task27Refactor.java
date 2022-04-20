package student_aleksandrs_jakovenko.lesson_5.level_7;

import student_aleksandrs_jakovenko.lesson_5.level_5_and_6.ArrayUtil;

public class Task27Refactor {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        System.out.println(arrayUtil.findMaxNumber(numbers));
    }
}
