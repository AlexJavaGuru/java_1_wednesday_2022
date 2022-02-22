package student_andrejs_saldavs.lesson_05.level_5;

import java.util.Arrays;

class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] myArray = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
//        System.out.println(Arrays.toString(myArray));

        arrayUtil.printArrayToConsole(myArray);

        arrayUtil.findMaxNumber(myArray);

        arrayUtil.findMinNumber(myArray);
    }

}
