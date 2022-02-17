package teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Random;

class ArrayUtil {

//    int[] createArray(int arrayLength) {
//        return;
//    }

    public void fillArrayWithRandomNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
    }
}
