package student_jekaterina_soldatova.lesson_5.middle;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = i;
        }
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = 0;
        for (int i: array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
