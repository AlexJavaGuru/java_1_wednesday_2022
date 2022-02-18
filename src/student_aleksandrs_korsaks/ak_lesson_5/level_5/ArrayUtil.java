package student_aleksandrs_korsaks.ak_lesson_5.level_5;

import java.util.Random;

class ArrayUtil {
    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] arrayOfNumbers) {
        Random random = new Random();
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(100);
        }
    }
}