package teacher.lesson_5_arrays_for_loop.lessoncode;

import student_arturs_melnikovs.lesson_03.level_05.Dog;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int a = 10;
        int[] myArray = new int[10];
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
