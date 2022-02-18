package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import student_aleksandrs_korsaks.ak_lesson_5.level_5.ArrayUtil;

class TaskTwentyEight {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);
        int min = arrayUtil.findMinNumber(numbers);
        System.out.println("Max Array`s element is: " + min);
    }
}