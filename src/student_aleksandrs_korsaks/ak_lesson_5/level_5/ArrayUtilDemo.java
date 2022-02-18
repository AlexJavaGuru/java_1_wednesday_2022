package student_aleksandrs_korsaks.ak_lesson_5.level_5;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arrayOfNumbers = arrayUtil.createArray(2);
        arrayUtil.fillArrayWithRandomNumbers(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));
    }
}
