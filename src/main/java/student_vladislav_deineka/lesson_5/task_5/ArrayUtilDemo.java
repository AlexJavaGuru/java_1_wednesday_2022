package student_vladislav_deineka.lesson_5.task_5;

import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
