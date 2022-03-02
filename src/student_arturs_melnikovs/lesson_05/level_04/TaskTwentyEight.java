package student_arturs_melnikovs.lesson_05.level_04;

import java.util.Arrays;
import java.util.Random;

class TaskTwentyEight {

    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int minNumber = numbers[0];

        for (int number : numbers) {
            if(number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println(minNumber);

        //        level 7 рефакторинг, используя созданный в level_06  клас ArrayUtil
//
//        ArrayUtil arrayUtil = new ArrayUtil();
//        int[] numbers = arrayUtil.createArray(15);
//        arrayUtil.fillArrayWithRandomNumbers(numbers);
//        arrayUtil.printArrayToConsole(numbers);
//        System.out.println(arrayUtil.findMinNumber(numbers));
    }

}
