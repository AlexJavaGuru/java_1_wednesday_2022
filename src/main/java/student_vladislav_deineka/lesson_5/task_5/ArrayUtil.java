package student_vladislav_deineka.lesson_5.task_5;

import java.util.Random;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
    }
}
