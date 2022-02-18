package student_aleksandrs_korsaks.ak_lesson_5.level_4;

import student_aleksandrs_korsaks.ak_lesson_5.level_5.ArrayUtil;

class TaskTwentyNine {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(numbers);
        arrayUtil.printArrayToConsole(numbers);

        System.out.print("Even Array`s element:");
        for (int number : numbers) {
            if ((number % 2 != 0) || (number == 0)) {
                continue;
            }
            System.out.print(" [" + number + "]");
        }
    }
}


